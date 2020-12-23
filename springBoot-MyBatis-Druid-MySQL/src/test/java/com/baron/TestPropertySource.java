package com.baron;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Baron
 * @date 2020/11/12 11:35
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPropertySource {

    @Resource
    private Baron baron;

    @Test
    public void test1(){
        System.out.println(baron.toString());
    }
}
