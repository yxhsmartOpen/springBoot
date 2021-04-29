package com.baron.springboot.http.isp;

/**
 * 主动获取状态报告
 * @author yangxuanhua
 * @since v1.0
 */
public class ActiveObtainReport {

    /**ISP登陆名(公司分配给ISP)，如果为机构版，则应以“机构ID:登陆名”方式赋值*/
    private String username;
    /**ISP登陆密码(公司分配给ISP)*/
    private String password;
    /**每次收取的状态报告的数量,为空时默认为50,最大值不可超过100*/
    private String itemNum;
    /**获取的信息类型，0 为状态报告 1为上行，默认为0*/
    private String msgType;
    /**获取状态报告的方式，为0时则获取用户登陆时所属机构的下所有用户的状态报告信息或者上行信息，为1时则只获取登陆用户所属机构名下该登陆用户的状态报告信息或者上行信息,为空时默认为0.*/
    private String getType;
    /**在查询上行短信时，如果传入上行短信ID那么将会获取大于等于该值的所有上行短信信息。*/
    private String moMsgId;
    /**决定HTTP返回的内容是何种格式，目前支持XML和JSON两种格式。客户需要何种格式的返回内容，有此参数传值决定，默认为XML*/
    private String dataType;
}
