package com.baron.aof23;

/**
 * 懒汉式
 * @author Baron
 * @date 2020/8/26 10:42
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    public static synchronized LazySingleton newLazySingletonInstance(){
        if (null == lazySingleton){
             lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
