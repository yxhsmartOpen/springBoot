package com.baron.lock;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 模拟 {@link java.util.HashMap } 线程安全数据问题
 * @author Baron
 * @date 2020/8/28 18:23
 */
@Slf4j
public class TestThreadSafeMap {
    private static Map<Integer, String> map = new HashMap<>(32);

    static ExecutorService exec = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            exec.submit(() -> {
               // log.info(Thread.currentThread().getName());
                map.put(finalI, "test:" + finalI);
            });
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println(map);
        exec.shutdown();
    }
}

