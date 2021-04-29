package com.baron.springboot.http.isp;

import java.util.List;

/**
 * 一对一短信下行
 * @author yangxuanhua
 * @since v1.0
 */
public class oneToOneMtVo {
    /**登录名*/
    private String username;
    /**ISP登陆密码(公司分配给ISP)*/
    private String password;
    private List<oneToOneMt> list;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<oneToOneMt> getList() {
        return list;
    }

    public void setList(List<oneToOneMt> list) {
        this.list = list;
    }
}
