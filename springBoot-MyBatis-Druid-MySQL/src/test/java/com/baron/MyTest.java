package com.baron;

import com.baron.aof23.EnumSingleton;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Baron
 * @date 2020/8/8 16:32
 */
@SpringBootApplication
public class MyTest implements ApplicationRunner {

    /**
     * 测试三目运算符自动拆箱带来的NPE问题
     */
    @Test
    public void auto() {
        boolean flag = true; // 设置成 true，保证条件表达式的表达式二一定可以执行
        boolean simpleBoolean = false; // 定义一个基本数据类型的 boolean 变量
        Boolean nullBoolean = null;// 定义一个包装类对象类型的 Boolean 变量，值为 null
        boolean x = flag ? nullBoolean : simpleBoolean; // 使用三目运算符并给 x 变量赋值
    }

    @Test
    public void genator() {
        SpringApplication.run(MyTest.class, "args");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        generateArtifacts();
    }

    private void generateArtifacts() throws Exception {
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(
                this.getClass().getResourceAsStream("/generatorConfig.xml"));
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void testLambda() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(c -> System.out.println(c));  // @3
        List<Integer> list2 = new ArrayList<>();
        // list.forEach(e->list2.add(e));  @1
        list.forEach(list2::add);//     @2 等价于 @1
        list2.forEach(System.out::println); // @4 等价于 @3
        //Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(list::get, list::get,(k1, k2) -> k1)); // 目的是list 转 map，但是内部实现没整明白。

    }

    /**
     * 测试 a = a+b 的简写 a += b,如果我们不小心写成了 a =+ b，就会出现意想不到的结果
     */
    @Test
    public void test() {
        int a = 100;
        int b = 2;
        System.out.println(a += b);
        System.out.println(a = +b);
    }

    /**
     * This method will always cache values in the range -128 to 127,
     * inclusive, and may cache other values outside of this range.
     *
     * @code{} public static Integer valueOf(int i) {
     * if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
     * return IntegerCache.cache[i + (-IntegerCache.low)];
     * return new Integer(i);
     * }
     */
    @Test
    public void testReference() {
        Integer a = 100, b = 100;
        Integer c = 1000, d = 1000;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    /**
     * 测试枚举单例是否防御反射攻击，答案是肯定的。
     * 注释 @2 行，运行@1行。运行结果报错，看起来是因为没有空的构造函数导致的，还并不能下定义说防御了反射攻击。那它有什么构造函数呢，可以看它的父类Enum类：
     * 此时注释 @1 行，运行@2行。运行结果还是报错，提示非法操作，通过enum 创建的对象不能进行反射。查看 Constructor 源码的417行，有如下限制
     *
     * @throws Exception
     * @code if ((clazz.getModifiers() & Modifier.ENUM) != 0)
     * throw new IllegalArgumentException("Cannot reflectively create enum objects");
     * ...
     */
    @Test
    public void testEnumSingletonReflectively() throws Exception {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        // 拿到所有的构造函数，包括非public的
        // Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(); // @1
        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class); // @2
        constructor.setAccessible(true);

        System.out.println("拿到了构造器：" + constructor);
        // 拿到所有的构造函数，包括非public的
        EnumSingleton enumSingleton1 = constructor.newInstance("testInstance", 1);

        System.out.println(enumSingleton);
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton == enumSingleton1);
    }

    /**
     * 测试枚举单例序列化反序列化安全性，答案是肯定的。运行结果返回为true。
     *
     * @throws Exception
     */
    @Test
    public void testEnumSingletonSerialization() throws Exception {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        byte[] serialize = SerializationUtils.serialize(enumSingleton);
        Object deserialize = SerializationUtils.deserialize(serialize);
        System.out.println(enumSingleton == deserialize); //true
    }

    /**
     * switch () 里的表达式类型只支持 字符、字节、短整型、整型、字符串、枚举
     */
    @Test
    public void testSwitch() {
        Integer a = 5;
        String b = "小王";
        Long c = 1L;
        Boolean d = false;
        Byte e = 1;
        Short f = 3;
        char g = '王';
        Double h = 1.1;

        switch (b) {
            case "小王":
                System.out.println(5);
                break; //可选
            case "老王":
                System.out.println(6);
                break; //可选
            default:
                System.out.println(7);
        }
    }

    /**
     * 测试
     * &（按位与）、|（按位或）、||（逻辑或）、^（异或运算符）、<<（左移运算符）、>>（右移运算符）、~（取反运算符）、>>>（无符号右移运算符）
     */
    @Test
    public void testBitOperation() {

        /**
         * &(按位与) 的运算规则是将两边的数转换为二进制位，然后运算最终值，运算规则即(两个为真才为真)1&1=1 , 1&0=0 , 0&1=0 , 0&0=0
         * 3的二进制位是0000 0011 ， 5的二进制位是0000 0101 ， 那么就是011 & 101，由按位与运算规则得知，001 & 101等于0000 0001，最终值为1
         * 7的二进制位是0000 0111，那就是111 & 101等于101，也就是0000 0101，故值为5
         */
        System.out.println(3 & 5);// 结果为 1
        System.out.println(5 & 7);// 结果为 5

        /**
         * &&(逻辑与) 也称为短路逻辑与，先运算&&左边的表达式，一旦为假，后续不管多少表达式，均不再计算，一个为真，再计算右边的表达式，两个为真才为真。
         */
        String str = null;
        if (null != str && (100 / 0 == 0)) {
            System.out.println("&& 表达式一但为假，后面不再计算");
        } else {
            System.out.println("(100 /0 ==0 ) 一但被计算会报错");
        }

        /**
         * |(按位或) 和 &(按位与) 计算方式都是转换二进制再计算，不同的是运算规则(一个为真即为真)1|0 = 1 , 1|1 = 1 , 0|0 = 0 , 0|1 = 1
         * 6的二进制位0000 0110 , 2的二进制位0000 0010 , 110|010为110，最终值0000 0110，故6|2等于6
         */
        System.out.println(6 | 2);// 结果为 6

        /**
         * ||(逻辑或) 的运算规则是一个为真即为真，后续不再计算，一个为假再计算右边的表达式。
         */
        if (5 > 3 || 3 > 5) {
            System.out.println("结果为真");
        }

        /**
         * ^(异或运算符) 顾名思义，异就是不同，其运算规则为1^0 = 1 , 1^1 = 0 , 0^1 = 1 , 0^0 = 0
         * 5的二进制位是0000 0101 ， 9的二进制位是0000 1001，也就是0101 ^ 1001,结果为1100 , 00001100的十进制位是12
         */
        System.out.println(5 ^ 9);// 结果为 12

        /**
         * 5<<2的意思为5的二进制位往左挪两位，右边补0，5的二进制位是0000 0101 ， 就是把有效值101往左挪两位就是0001 0100 ，正数左边第一位补0，负数补1，等于乘于2的n次方，十进制位是20
         * 凡位运算符都是把值先转换成二进制再进行后续的处理，5的二进制位是0000 0101，右移两位就是把101左移后为0000 0001，正数左边第一位补0，负数补1，等于除于2的n次方，结果为1
         */
        System.out.println(5 << 2);// 结果为 20
        System.out.println(5 >> 2);// 结果为 1

        /** 取反就是1为0,0为1,5的二进制位是0000 0101，取反后为1111 1010，值为-6 */
        System.out.println(~5);// 结果为 -6

        /**
         * >>>(无符号右移运算符) 和右移运算符的主要区别在于负数的计算，因为无符号右移是高位补0，移多少位补多少个0。15的二进制位是0000 1111 ， 右移2位0000 0011，结果为3
         * -6的二进制是6的二进制取反再加1,6的二进制也就是0000 0000 0000 0000 0000 0000 0000 0110，取反后加1为1111 1111 1111 1111 1111 1111 1111 1010，右移三位0001 1111 1111 1111 1111 1111 1111 1111
         */
        System.out.println(15 >>> 2);// 结果为 3
        System.out.println(-6 >>> 3);// 结果为 536870911

        /** 对一个数 取模 时，如果这个数是2的n次方，这个数 取模 的结果和这个数的 取与 的结果是相等的，取与 的速度比 取模 的快。*/
        System.out.println((35 % 8) == (35 & 7)); // 结果为True
    }

    /**
     * java 数据类型转换
     * Java 基本数据类型：字符类型char，布尔类型boolean以及数值类型byte、short、int、long、float、double
     */
    @Test
    public void tranTypeConversion() {
        /**
         * @Q short s1 = 1; s1 = s1 + 1;有错吗?short s1 = 1; s1 += 1;有错吗
         * 对于 short s1 = 1; s1 = s1 + 1;由于 1 是 int 类型，因此 s1+1 运算结果也是 int型，需要强制转换类型才能赋值给 short 型。
         * 而 short s1 = 1; s1 += 1;可以正确编译，因为 s1+= 1;相当于 s1 = (short(s1 + 1);其中有隐含的强制类型转换。
         */

        /**
         * @Q float f=3.4;是否正确
         * 不正确。3.4 是双精度数，将双精度型（double）赋值给浮点型（float）属于下转型（down-casting，也称为窄化）会造成精度损失，因此需要强制类型转换float f =(float)3.4; 或者写成 float f =3.4F;。
         */
    }


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 多次运行会爆 {@link java.lang.NumberFormatException} 异常
     * 解决办法：
     * 1：每次使用的时候再创建 {@link java.text.SimpleDateFormat}对象，参考{@link MyTest#testSimpleDateFormat2()}
     * 2：通过{@link java.lang.ThreadLocal}对象解决线程不安全的问题，参考{@link MyTest#testSimpleDateFormat3()}
     * 3：通过 synchrinized 关键字加锁解决线程不安全问题，参考{@link MyTest#testSimpleDateFormat4()}
     */
    @Test
    public void testSimpleDateFormat() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(sdf.parse("2017-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    /**
     * 每次使用的时候再创建{@link java.text.SimpleDateFormat}对象，这样虽然能保证线程安全，但是频繁创建和消费对象会造成资源的浪费。
     *
     * @throws InterruptedException
     */
    @Test
    public void testSimpleDateFormat2() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    System.out.println(sdf1.parse("2017-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }


    ThreadLocal<DateFormat> dateFormatThreadLocal = new ThreadLocal<DateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    /**
     * 通过 {@link java.lang.ThreadLocal} 类解决 {@link java.text.SimpleDateFormat} 类线程不安全的问题
     */
    @Test
    public void testSimpleDateFormat3() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(dateFormatThreadLocal.get().parse("2017-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    /**
     * 通过 synchrinized 解决 {@link java.text.SimpleDateFormat} 类线程不安全的问题
     */
    @Test
    public void testSimpleDateFormat4() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                try {
                    synchronized (sdf) {
                        System.out.println(sdf.parse("2017-12-13 15:17:27"));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

    @Test
    public void test1() {
        String ss = "sss";
        if ("true".equals(ss)) {
            System.out.println("1111");
        }

        System.out.println(ss.substring(0,1).toUpperCase());
        System.out.println(ss.substring(1,ss.length()));
        System.out.println(false && false && false);
    }

}
