package com.baron.springboot.http.isp;

/**
 *
 * @author yangxuanhua
 * @since v1.0
 */
public class Mt {

    /**登录名*/
    private String username;
    /**ISP登陆密码(公司分配给ISP)*/
    private String password;
    /**发送手机号*/
    private String from;
    /**接收短信的手机号，支持多个(<=100)手机号码，中间以“,”分割*/
    private String to;
    /**短信内容 GET方式时，必须进行GBK的URL转码  POST方式时，则不需要进行URL转码*/
    private String content;
    /**单独指定短信签名，不需要带上中括号 GET方式时，必须进行GBK的URL转码  POST方式时，则不需要进行URL转码*/
    private String sign;
    /** 用户下行短信自扩展端口，其该端口的使用需要相关机构的指定配置。（该字段单独最大长度为14位，但下行短信实际发送后会根据SP号进行相关的截取操作）*/
    private String expandPrefix;

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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExpandPrefix() {
        return expandPrefix;
    }

    public void setExpandPrefix(String expandPrefix) {
        this.expandPrefix = expandPrefix;
    }
}
