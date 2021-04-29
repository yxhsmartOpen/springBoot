package com.baron.springboot.http.isp;

/**
 * 上行
 * @author yangxuanhua
 * @since v1.0
 */
public class Mo {
    /**参数为空（暂时无用）*/
    private String subid;
    /**该条上行短信的源号码，一般是用户手机号*/
    private String moFrom;
    /**该条上行短信的目标号码，一般是SP长号码*/
    private String moTo;
    /**该上行短信涉及到的客户ID*/
    private String userId;
    /**该上行短信的内容*/
    private String moContent;
    /**上行短信的唯一标示符*/
    private String momsgId;
    /**该上行短信的接收时间*/
    private String createTime;

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getMoFrom() {
        return moFrom;
    }

    public void setMoFrom(String moFrom) {
        this.moFrom = moFrom;
    }

    public String getMoTo() {
        return moTo;
    }

    public void setMoTo(String moTo) {
        this.moTo = moTo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMoContent() {
        return moContent;
    }

    public void setMoContent(String moContent) {
        this.moContent = moContent;
    }

    public String getMomsgId() {
        return momsgId;
    }

    public void setMomsgId(String momsgId) {
        this.momsgId = momsgId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
