package com.baron.springboot.http.isp;

import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
public class FiveGMtVo {
    /**登录名*/
    private String username;
    /**ISP登陆密码(公司分配给ISP)*/
    private String password;
    private List<FiveGMt> list;

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

    public List<FiveGMt> getList() {
        return list;
    }

    public void setList(List<FiveGMt> list) {
        this.list = list;
    }
}
