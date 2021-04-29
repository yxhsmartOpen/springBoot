package com.baron.springboot.http.isp;

/**
 * 5g下行接口返回
 * @author yangxuanhua
 * @since v1.0
 */
public class FiveGMtReturn {

    /**发送短信的目的手机号。*/
    private String toMobile;
    /**发送短信的短信ID，用于状态报告对应。当错误时则此字段为空。*/
    private String messageId;
    /**具体的错误信息。是某手机号提交失败的原因。*/
    private String mobileDesc;

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMobileDesc() {
        return mobileDesc;
    }

    public void setMobileDesc(String mobileDesc) {
        this.mobileDesc = mobileDesc;
    }
}
