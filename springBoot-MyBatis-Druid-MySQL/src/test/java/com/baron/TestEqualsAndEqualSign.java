package com.baron;

import org.junit.Test;

/**
 * 测试等号“=”和equal
 * @author Baron
 * @date 2020/11/10 22:48
 */
public class TestEqualsAndEqualSign {

    /**
     * "==" , 基本数据类型，等号比较的是值，引用数据类型，等号比较的是内存地址
     * “equals”，基本数据类型，“equals”比较等价于“==”比较，引用数据类型，如果equals没有被重写，比较的是内存地址
     */
    @Test
    public void test1(){
        Integer a =100;
        Integer b = 100;

        Integer a2 = 129;
        Integer b2 = 129;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a2 == b2);
        System.out.println(a2.equals(b2));

        String a1 = "aaa";
        String b1 = "aaa";

        System.out.println(a1 == b1);
        System.out.println(a.equals(b));


        String c = "aaa";
        String c1 = "a"+new String("aa");

        System.out.println(c == c1);
        System.out.println(c.equals(c1));
    }
}
