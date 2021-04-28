package com.baron.springboot;

/**
 * 子平台通道数据
 * @author yangxuanhua
 * @since v1.0
 */
public class SubPlatformChannel {

    /**上线平台名称*/
    private String onlinePlatform;
    /**上线平台代码*/
    private String onlinePlatformCode;
    /**通道代码*/
    private String channelCode;
    /**通道账号*/
    private String channelUserId;
    /**通道名称*/
    private String channelName;
    /**通道状态*/
    private String channelStatus;
    /**可扩展长度*/
    private String expandLength;
    /**运营商*/
    private String service;
    /**SP码号*/
    private String spNumber;
    /**接入运营商通道类型*/
    private String isPrepChannel;
    /**1新增，2更新*/
    private String opType;

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOnlinePlatform() {
        return onlinePlatform;
    }

    public void setOnlinePlatform(String onlinePlatform) {
        this.onlinePlatform = onlinePlatform;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
    }

    public String getExpandLength() {
        return expandLength;
    }

    public void setExpandLength(String expandLength) {
        this.expandLength = expandLength;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSpNumber() {
        return spNumber;
    }

    public void setSpNumber(String spNumber) {
        this.spNumber = spNumber;
    }

    public String getIsPrepChannel() {
        return isPrepChannel;
    }

    public void setIsPrepChannel(String isPrepChannel) {
        this.isPrepChannel = isPrepChannel;
    }

    public String getOnlinePlatformCode() {
        return onlinePlatformCode;
    }

    public void setOnlinePlatformCode(String onlinePlatformCode) {
        this.onlinePlatformCode = onlinePlatformCode;
    }

    @Override
    public String toString() {
        return "SubPlatformChannel{" +
                "onlinePlatform='" + onlinePlatform + '\'' +
                ", onlinePlatformCode='" + onlinePlatformCode + '\'' +
                ", channelCode='" + channelCode + '\'' +
                ", channelUserId='" + channelUserId + '\'' +
                ", channelName='" + channelName + '\'' +
                ", channelStatus='" + channelStatus + '\'' +
                ", expandLength='" + expandLength + '\'' +
                ", service='" + service + '\'' +
                ", spNumber='" + spNumber + '\'' +
                ", isPrepChannel='" + isPrepChannel + '\'' +
                '}';
    }
}
