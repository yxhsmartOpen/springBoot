package com.baron.springboot.http.isp;

/**
 * 一对一短信下行
 * @author yangxuanhua
 * @since v1.0
 */
public class oneToOneMt {

    /**目的手机号，此处不支持同时传多手机号*/
    private String toMobile;
    /**短信内容，每条内容不超过1000字*/
    private String content;
    /**扩展端口*/
    private String extPort;

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtPort() {
        return extPort;
    }

    public void setExtPort(String extPort) {
        this.extPort = extPort;
    }
}
