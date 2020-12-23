package com.baron;

/**
 * @author Baron
 * @date 2020/11/10 23:09
 */
public class TestTryCatch {
    public static void main(String[] args) {
        TestTryCatch testTryCatch = new TestTryCatch();
        testTryCatch.menthod();
    }

    private void menthod() {
        try{
            System.out.println("进入到try块了");
        }catch (Exception e){
            System.out.println("异常发生了");
        }finally {
            System.out.println("进入到finally 块了");
        }
        System.out.println("后续代码");

    }
}
