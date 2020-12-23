package cn.baron.springboot.mongo.repository.init;

import javax.annotation.PostConstruct;

/**
 * @author Baron
 * @date 2020/12/10 10:11
 */
public class BaronInit {

    @PostConstruct
    public void test1(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
