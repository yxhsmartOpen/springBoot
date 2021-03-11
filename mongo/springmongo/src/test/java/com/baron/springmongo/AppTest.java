package com.baron.springmongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mongodb.xml")
public class AppTest {

    @Autowired
    MongoDBServiceImpl mongoDBService;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查询所有
     * 指定ID查询
     */
    @Test
    public void query() {
        List<UserInfo> list = mongoTemplate.findAll(UserInfo.class);
        System.out.println("list " +list.size());
        for (UserInfo userInfo : list) {
            System.out.println("UserInfo " +userInfo.toString());
        }
        UserInfo C = mongoDBService.findById(UserInfo.class,"6049c2738d18315b851ce4aa");
        System.out.println("UserInfo " +C.toString());
    }

    /**
     * 新增
     */
    @Test
    public void insert() {
        UserInfo user = UserInfo.builder().name("老王1").age(18).birth(new Timestamp(System.currentTimeMillis())).build();
        mongoTemplate.insert(user);
        UserInfo user2 = UserInfo.builder().name("老王2").age(19).birth(new Timestamp(System.currentTimeMillis())).build();
        mongoTemplate.insert(user2);
        UserInfo user3 = UserInfo.builder().name("老王3").age(20).birth(new Timestamp(System.currentTimeMillis())).build();
        mongoDBService.add(user3);
        System.out.println("执行成功");
    }

    @Test
    public void queryList(){
        
    }


}
