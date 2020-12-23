package com.baron;

import java.util.HashMap;

/**
 * 测试HashMap 在多线程环境下循环删除元素
 * @author Baron
 * @date 2020/11/12 21:53
 */
public class TestHashMapRemoveMenthod {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            map.put(i,i);
        }

    }

    public static void menthod(){

    }
}
