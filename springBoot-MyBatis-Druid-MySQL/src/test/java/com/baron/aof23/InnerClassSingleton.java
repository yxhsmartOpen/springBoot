package com.baron.aof23;

/**
 * 静态内部类
 * @author Baron
 * @date 2020/8/26 10:46
 */
public class InnerClassSingleton {
    private static class InnerClassSingletonHolder{
        public static InnerClassSingleton innerClassSingleton  = new InnerClassSingleton();
    }
    private InnerClassSingleton(){}
    public static InnerClassSingleton getInstance(){
        return InnerClassSingletonHolder.innerClassSingleton;
    }
}
