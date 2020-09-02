package com.baron.aof23;

/**
 * 双重检查锁
 * @author Baron
 * @date 2020/8/26 10:46
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;
    private DoubleCheckSingleton(){}
    public static  DoubleCheckSingleton newDoubleCheckSingletonInstance(){
        if (null == doubleCheckSingleton){
            synchronized (DoubleCheckSingleton.class){
                if (null == doubleCheckSingleton){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
