package com.baron.basis;

import org.junit.Test;

/**
 * @author Baron
 * @date 2020/9/23 13:46
 */
public class BasicDataTypeTest {

    /**
     * Java基本类型共有八种，基本类型可以分为三类：
     *
     * 字符类型char
     * 布尔类型boolean
     * 整数类型byte、short、int、long
     * 浮点数类型float、double。
     *
     *
     * 整型的取值范围
     * Java中的整型主要包含byte、short、int和long这四种，表示的数字范围也是从小到大的，之所以表示范围不同主要和他们存储数据时所占的字节数有关。
     * 先来个简答的科普，1字节=8位（bit）。java中的整型属于有符号数。
     * 先来看计算中8bit可以表示的数字：
     * 最小值：10000000 （-128）(-2^7)
     * 最大值：01111111（127）(2^7-1)
     *
     * 整型的这几个类型中，
     *
     * byte：byte用1个字节来存储，范围为-128(-2^7)到127(2^7-1)，在变量初始化的时候，byte类型的默认值为0。
     * short：short用2个字节存储，范围为-32,768 (-2^15)到32,767 (2^15-1)，在变量初始化的时候，short类型的默认值为0，一般情况下，因为Java本身转型的原因，可以直接写为0。
     * int：int用4个字节存储，范围为-2,147,483,648 (-2^31)到2,147,483,647 (2^31-1)，在变量初始化的时候，int类型的默认值为0。
     * long：long用8个字节存储，范围为-9,223,372,036,854,775,808 (-2^63)到9,223,372,036, 854,775,807 (2^63-1)，在变量初始化的时候，long类型的默认值为0L或0l，也可直接写为0。
     *
     */
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

    /**
     * 包装类与基本数据类型进行比较运算，是先将包装类进行拆箱成基本数据类型，然后进行比较的。
     */
    @Test
    public void test1(){

        Integer a=1;
        System.out.println(a==1?"等于":"不等于");
        Boolean bool=false;
        System.out.println(bool?"真":"假");
    }
}
