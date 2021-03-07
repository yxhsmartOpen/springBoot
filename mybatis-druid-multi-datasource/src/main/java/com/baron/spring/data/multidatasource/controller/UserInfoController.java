
package com.baron.spring.data.multidatasource.controller;


import com.baron.spring.data.multidatasource.mapper.db1.UserInfo1Mapper;
import com.baron.spring.data.multidatasource.mapper.db2.UserInfo2Mapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 人员信息接口
 *
 * @author yangxuanhua
 * @date 2021-02-22 23:10:08
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Resource
    private UserInfo1Mapper userInfo1Mapper;

    @Resource
    private UserInfo2Mapper userInfo2Mapper;

    /**
     * 获取 db1与 db2的所有人员
     * 仅用与 demo项目测试
     *
     * @author yangxuanhua
     */
    @PostMapping("/list-all")
    public Map<String, Object> getAllUser() {
        Map<String, Object> result = new HashMap<>(2);
        result.put("DB1-USERS", userInfo1Mapper.listAll());
        result.put("DB2-USERS", userInfo2Mapper.listAll());
        return result;
    }
}