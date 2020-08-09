package com.baron;

import org.junit.Test;

/**
 * @author Baron
 * @date 2020/8/8 16:32
 */
public class MyTest {

    /**
     * 测试三目运算符自动拆箱带来的NPE问题
     */
    @Test
    public void auto(){
        boolean flag = true; // 设置成 true，保证条件表达式的表达式二一定可以执行
        boolean simpleBoolean = false; // 定义一个基本数据类型的 boolean 变量
        Boolean nullBoolean = null;// 定义一个包装类对象类型的 Boolean 变量，值为 null
        boolean x = flag ? nullBoolean : simpleBoolean; // 使用三目运算符并给 x 变量赋值
    }
}
