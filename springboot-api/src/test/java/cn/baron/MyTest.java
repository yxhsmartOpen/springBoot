package cn.baron;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Baron
 * @date 2020/8/8 13:32
 */
public class MyTest {

    /**
     * 集合转数组的正确姿势
     */
    @Test
    public void compare(){
        List<String> list = new ArrayList<>(2);
        list.add("guan");
        list.add("bao");
        if(null != list && !list.isEmpty()){
            System.out.println(list.toString());
            String[] array = list.toArray(new String[0]);
            System.out.println(array[0]+" and "+array[1]);
        }
    }

    /**
     * 把方法最後一行注釋掉
     */
    @Test
    public void myTest(){
        List<String> generics = null;
        List notGenerics = new ArrayList(10);
        notGenerics.add(new Object());
        notGenerics.add(new Integer(1));
        generics = notGenerics;
        // 此处抛出 ClassCastException 异常
      //  String string = generics.get(0);
    }

    /**
     * 不要在 foreach 循环里进行元素的 remove/add 操作。remove 元素请使用 Iterator
     * 方式，如果并发操作，需要对 Iterator 对象加锁。
     */
    @Test
    public void testForeachRemoveOrAdd(){
        // 正例

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (iterator.hasNext()) {
                iterator.remove();
            }
        }

        // 反例：

        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            } }
    }


    /**
     * 表达异常的分支时，少用 if-else 方式
     * 如果非使用 if()...else if()...else...方式表达逻辑，避免后续代码维护困难，请勿超过 3 层。
     * 超过 3 层的 if-else 的逻辑判断代码可以使用卫语句、策略模式、状态模式等来实现，其中卫语句
     * 示例如下：
     */
    @Test
    public void findBoyfriend () {
        if (true) {
            System.out.println("本姑娘是外貌协会的资深会员");
            return;
        }
        if (true) {
            System.out.println("贫贱夫妻百事哀");
            return;
        }
        if (true) {
            System.out.println("银河有多远，你就给我滚多远");
            return; }
        System.out.println("可以先交往一段时间看看");
    }
}
