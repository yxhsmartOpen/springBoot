package com.baron.springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Slf4j
public class StreamTest {

    private static final List<PersonModel> list;

    static {
        PersonModel wu = new PersonModel("wu qi", 18, "男");
        PersonModel zhang = new PersonModel("zhang san", 19, "男");
        PersonModel wang = new PersonModel("wang si", 20, "女");
        PersonModel zhao = new PersonModel("zhao wu", 20, "男");
        PersonModel chen = new PersonModel("chen liu", 21, "男");
        list = Arrays.asList(wu, zhang, wang, zhao, chen);
    }

    public static List<PersonModel> getData() {
        return list;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class PersonModel {
        private String name;
        private Integer age;
        private String sex;
    }

    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    @Test
    public void testStream() {
        List<String> list = Lists.newArrayList("iteblog", "iteblog_hadoop");
        Stream<String> listStream = list.stream();

        Set<String> set = Sets.newHashSet();
        Stream<String> setStream = set.stream();


        OptionalInt sum = IntStream.range(1, 4).reduce(Integer::sum);
        System.out.println(sum);


        int reducedTwoParams = IntStream.range(1, 4).reduce(10, Integer::sum);
        System.out.println(reducedTwoParams);

        int reducedParams = Stream.of(1, 2, 3)
                .reduce(10, Integer::sum, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });

        System.out.println(reducedParams);


        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, Integer::sum, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });

        System.out.println(reducedParallel);

    }

    @Test
    public void testStream2() {
        Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .map(String::length) //转成单词的长度 int
                .forEach(System.out::println); //输出

        Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .map(String::length) //转成单词的长度 int
                .forEach(System.out::println);

        Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .mapToInt(String::length) //转成int
                .forEach(System.out::println);

        Stream.of("a-b-c-d", "e-f-i-g-h")
                .flatMap(e -> Stream.of(e.split("-")))
                .forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 5, 6)
                .limit(3) //限制三个
                .forEach(System.out::println); //将输出 前三个 1，2，3

        Stream.of(1, 2, 3, 1, 2, 5, 6, 7, 8, 0, 0, 1, 2, 3, 1)
                .distinct() //去重
                .forEach(System.out::println);

        Stream.of(1, 2, 3, 1, 2, 5, 6, 7, 8, 0, 0, 1, 2, 3, 1)
                .filter(e -> e >= 5) //过滤小于5的
                .forEach(System.out::println);


        User w = new User("w", 10);
        User x = new User("x", 11);
        User y = new User("y", 12);

        Stream.of(w, x, y)
                .peek(e -> e.setName(e.getAge() + e.getName())) //重新设置名字 变成 年龄+名字
                .forEach(e -> System.out.println(e));

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(4) //跳过前四个
                .forEach(System.out::println); //输出的结果应该只有5，6，7，8，9

        Stream.of(2, 1, 3, 6, 4, 9, 6, 8, 0)
                .sorted()
                .forEach(System.out::println);

        Stream.of(w, x, y)
                .sorted((e1, e2) -> e1.age > e2.age ? 1 : e1.age == e2.age ? 0 : -1)
                .forEach(e -> System.out.println(e));

        Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .collect(Collectors.toSet()) //set 容器
                .forEach(System.out::println);

        Set<String> stringSet = Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .collect(Collectors.toSet()); //收集的结果就是set
        stringSet.forEach(System.out::println); //set的语法糖forEach

        long count = Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .count();

        System.out.println(count);

        Optional<String> stringOptional = Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .findFirst();
        stringOptional.ifPresent(System.out::println);

        Optional<String> optional = Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .parallel()
                .findAny(); //在并行流下每次返回的结果可能一样也可能不一样
        optional.ifPresent(System.out::println);

        boolean result = Stream.of("aa", "bb", "cc", "aa")
                .noneMatch(e -> e.equals("aa"));
        System.out.println(result);

        Optional<Integer> integerOptional = Stream.of(0, 9, 8, 4, 5, 6, -1)
                .min(Integer::compareTo);

        integerOptional.ifPresent(System.out::println);

        Optional<Integer> ioptional = Stream.of(0, 9, 8, 4, 5, 6, -1)
                .max(Integer::compareTo);

        ioptional.ifPresent(System.out::println);

        int sum = Stream.of(0, 9, 8, 4, 5, 6, -1)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        Stream.of(0, 2, 6, 5, 4, 9, 8, -1)
                .parallel()
                .forEachOrdered(e -> System.out.println(Thread.currentThread().getName() + ": " + e));

        Object[] objects = Stream.of(0, 2, 6, 5, 4, 9, 8, -1)
                .toArray();

        for (Object object : objects) {
            System.out.println(object);
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class User {
        private String name;
        private Integer age;
    }

    @Test
    public void testStream3() {
        filterSex();
        filterSexAndAge();
        getUserNameList();
        flatMapString();
    }

    /**
     * 过滤所有的男性
     */
    @Test
    public void filterSex() {
        List<PersonModel> data = StreamTest.getData();

        //old
        List<PersonModel> temp = new ArrayList<>();
        for (PersonModel person : data) {
            if ("男".equals(person.getSex())) {
                temp.add(person);
            }
        }
        System.out.println(temp);
        //new
        List<PersonModel> collect = data
                .stream()
                .filter(person -> "男".equals(person.getSex()))
                .collect(toList());
        System.out.println(collect);
    }

    /**
     * 过滤所有的男性 并且小于20岁
     */
    @Test
    public void filterSexAndAge() {
        List<PersonModel> data = StreamTest.getData();

        //old
        List<PersonModel> temp = new ArrayList<>();
        for (PersonModel person : data) {
            if ("男".equals(person.getSex()) && person.getAge() < 20) {
                temp.add(person);
            }
        }

        //new 1
        List<PersonModel> collect = data
                .stream()
                .filter(person -> "男".equals(person.getSex()) && person.getAge() < 20)
                .collect(toList());
        //new 2
        List<PersonModel> collect1 = data
                .stream()
                .filter(person -> ("男".equals(person.getSex()) && person.getAge() < 20))
                .collect(toList());

    }

    /**
     * 取出所有的用户名字
     */
    @Test
    public void getUserNameList() {
        List<PersonModel> data = StreamTest.getData();

        //old
        List<String> list = new ArrayList<>();
        for (PersonModel persion : data) {
            list.add(persion.getName());
        }
        System.out.println(list);

        //new 1
        List<String> collect = data.stream().map(person -> person.getName()).collect(toList());
        System.out.println(collect);

        //new 2
        List<String> collect1 = data.stream().map(PersonModel::getName).collect(toList());
        System.out.println(collect1);

        //new 3
        List<String> collect2 = data.stream().map(person -> {
            System.out.println(person.getName());
            return person.getName();
        }).collect(toList());
    }

    @Test
    public void flatMapString() {
        List<PersonModel> data = StreamTest.getData();
        //返回类型不一样
        List<String> collect = data.stream()
                .flatMap(person -> Arrays.stream(person.getName().split(" "))).collect(toList());

        List<Stream<String>> collect1 = data.stream()
                .map(person -> Arrays.stream(person.getName().split(" "))).collect(toList());

        //用map实现
        List<String> collect2 = data.stream()
                .map(person -> person.getName().split(" "))
                .flatMap(Arrays::stream).collect(toList());
        //另一种方式
        List<String> collect3 = data.stream()
                .map(person -> person.getName().split(" "))
                .flatMap(str -> Arrays.asList(str).stream()).collect(toList());
    }

    @Test
    public void reduceTest() {
        //累加，初始化值是 10
        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(10, (count, item) -> {
                    System.out.println("count:" + count);
                    System.out.println("item:" + item);
                    return count + item;
                });
        System.out.println(reduce);

        Integer reduce1 = Stream.of(1, 2, 3, 4)
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce1);

        String reduce2 = Stream.of("1", "2", "3")
                .reduce("0", (x, y) -> (x + "," + y));
        System.out.println(reduce2);
    }

    /**
     * toList
     */
    @Test
    public  void toListTest() {
        List<PersonModel> data = StreamTest.getData();
        List<String> collect = data.stream()
                .map(PersonModel::getName)
                .collect(Collectors.toList());
    }

    /**
     * toSet
     */
    @Test
    public  void toSetTest() {
        List<PersonModel> data = StreamTest.getData();
        Set<String> collect = data.stream()
                .map(PersonModel::getName)
                .collect(Collectors.toSet());
    }

    /**
     * toMap
     */
    @Test
    public  void toMapTest() {
        List<PersonModel> data = StreamTest.getData();
        Map<String, Integer> collect = data.stream()
                .collect(
                        Collectors.toMap(PersonModel::getName, PersonModel::getAge)
                );

        data.stream()
                .collect(Collectors.toMap(per -> per.getName(), value -> value + "1"));
    }

    /**
     * 分组
     */
    @Test
    public void toGroupTest() {
        List<PersonModel> data = StreamTest.getData();
        Map<Boolean, List<PersonModel>> collect = data.stream()
                .collect(Collectors.groupingBy(per -> "男".equals(per.getSex())));
        System.out.println(collect);
    }

    /**
     * 分隔
     */
    @Test
    public  void toJoiningTest() {
        List<PersonModel> data = StreamTest.getData();
        String collect = data.stream()
                .map(personModel -> personModel.getName())
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);
    }

    /**
     * 自定义
     */
    @Test
    public void reduce() {
        List<String> collect = Stream.of("1", "2", "3").map(Arrays::asList).reduce(new ArrayList<>(), (y, z) -> {
            y.addAll(z);
            return y;
        });
        System.out.println(collect);
    }

    @Test
    public void testOptional() {
        try {
        PersonModel personModel = new PersonModel();

        //对象为空则打出 -
        Optional<Object> o = Optional.of(personModel);
        System.out.println(o.isPresent() ? o.get() : "-");

        //名称为空则打出 -
        Optional<String> name = Optional.ofNullable(personModel.getName());
        System.out.println(name.isPresent() ? name.get() : "-");

        //如果不为空，则打出xxx
        Optional.ofNullable("test").ifPresent(na -> System.out.println(na + "ifPresent"));

        //如果空，则返回指定字符串
        System.out.println(Optional.empty().orElse("-"));
        System.out.println(Optional.ofNullable("1").orElse("-"));

        //如果空，则返回 指定方法，或者代码
        System.out.println(Optional.empty().orElseGet(() -> "hahah"));
        System.out.println(Optional.ofNullable("1").orElseGet(() -> "hahah"));

        //如果空，则可以抛出异常
//        System.out.println(Optional.ofNullable("1").orElseThrow(() -> {
//            throw new RuntimeException("ss");
//        }));

        List<PersonModel> models = StreamTest.getData();
        Optional.ofNullable(models)
                .map(per -> per
                        .stream()
                        .map(PersonModel::getName)
                        .collect(toList()))
                .ifPresent(System.out::println);
        }catch (Exception e){
            log.info("x");
        }
    }

    private static final int size=10000000;
    /**
     * 测试list
     */
    @Test
    public  void testList(){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        List<Integer> temp1 = new ArrayList<>(size);
        //老的
        long start=System.currentTimeMillis();
        temp1.addAll(list);
        System.out.println(+System.currentTimeMillis()-start);

        //同步
        long start1=System.currentTimeMillis();
        new ArrayList<>(list);
        System.out.println(System.currentTimeMillis()-start1);

        //并发
        long start2=System.currentTimeMillis();
        list.parallelStream().collect(Collectors.toList());
        System.out.println(System.currentTimeMillis()-start2);
    }

    /**
     * 测试set
     */
    @Test
    public  void testSet(){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Set<Integer> temp1 = new HashSet<>(size);
        //老的
        long start=System.currentTimeMillis();
        temp1.addAll(list);
        System.out.println(+System.currentTimeMillis()-start);

        //同步
        long start1=System.currentTimeMillis();
        new HashSet<>(list);
        System.out.println(System.currentTimeMillis()-start1);

        //并发
        long start2=System.currentTimeMillis();
        list.parallelStream().collect(Collectors.toSet());
        System.out.println(System.currentTimeMillis()-start2);
    }
}
