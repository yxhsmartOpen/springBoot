package com.baron.springboot.http.isp;

/**
 * @author yangxuanhua
 * @since v1.0
 */
public class ActivePushReport {

    /**参数为空（暂时无用）*/
    private String subid;
    /**参数标识该条状态报告是否成功:1与3代表成功，其它数字代表失败*/
    private Integer sendFlag;
    /**状态报告返回时间,格式: yyyy-MM-dd HH:mm:ss*/
    private String reportTime;
    /**该发送短信的客户ID*/
    private Integer userId;
    /**该短信状态报告涉及到的接收手机号*/
    private Long toMobile;
    /**运营商返回的状态报告代码*/
    private String report;
    /**该条状态报告所对应的下行短信的唯一ID号，用于匹配发送短信时返回的messageID值*/
    private String messageId;

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public Integer getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(Integer sendFlag) {
        this.sendFlag = sendFlag;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getToMobile() {
        return toMobile;
    }

    public void setToMobile(Long toMobile) {
        this.toMobile = toMobile;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
