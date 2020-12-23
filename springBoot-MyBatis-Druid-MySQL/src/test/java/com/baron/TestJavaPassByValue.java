package com.baron;

/**
 * @author Baron
 * @date 2020/11/10 23:00
 */
public class TestJavaPassByValue {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        TestJavaPassByValue ex = new TestJavaPassByValue();
        ex.changes(ex.str, ex.ch);
        System.out.println(ex.str +"and");
        System.out.println(ex.ch);
    }

    public void changes(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
}
