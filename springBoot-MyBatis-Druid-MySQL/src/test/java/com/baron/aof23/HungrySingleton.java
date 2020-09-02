package com.baron.aof23;

/**
 * 饿汉式
 * @author Baron
 * @date 2020/8/26 10:45
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton newHungrySingletonInstance(){
        return hungrySingleton;
    }
}
