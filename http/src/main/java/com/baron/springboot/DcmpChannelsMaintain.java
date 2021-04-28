package com.baron.springboot;

import java.util.Date;

public class DcmpChannelsMaintain {
    private Long id;
    /** 上线平台 */
    private String onlinePlatform;
    /** 通道代码 */
    private String channelCode;
    /** 通道名称 */
    private String channelName;
    /** 通道账号 */
    private String channelUserId;
    /** 通道类型 */
    private String channelType;
    /** 通道状态 */
    private String channelStatus;
    /** 安全级别 */
    private String securityLevel;
    /** 供应商 */
    private String supplier;
    /** 省网计费省份 */
    private String chargeProvince;
    /** 可发内容 */
    private String maySendContent;
    /** 签名类型 */
    private String signType;
    /** 运营商 */
    private String serviceProvider;
    /** SP码号 */
    private String spNumber;
    /** 可扩展长度 */
    private String channelExpandLength;
    /** 维护人员 */
    private String maintainStaff;
    /** 备注 */
    private String remark;
    /** 接入运营商类型 */
    private String isPrepChannel;
    /**入库时间*/
    private Date rksj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOnlinePlatform() {
        return onlinePlatform;
    }

    public void setOnlinePlatform(String onlinePlatform) {
        this.onlinePlatform = onlinePlatform == null ? null : onlinePlatform.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId == null ? null : channelUserId.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus == null ? null : channelStatus.trim();
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel == null ? null : securityLevel.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getChargeProvince() {
        return chargeProvince;
    }

    public void setChargeProvince(String chargeProvince) {
        this.chargeProvince = chargeProvince == null ? null : chargeProvince.trim();
    }

    public String getMaySendContent() {
        return maySendContent;
    }

    public void setMaySendContent(String maySendContent) {
        this.maySendContent = maySendContent == null ? null : maySendContent.trim();
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider == null ? null : serviceProvider.trim();
    }

    public String getSpNumber() {
        return spNumber;
    }

    public void setSpNumber(String spNumber) {
        this.spNumber = spNumber == null ? null : spNumber.trim();
    }

    public String getChannelExpandLength() {
        return channelExpandLength;
    }

    public void setChannelExpandLength(String channelExpandLength) {
        this.channelExpandLength = channelExpandLength == null ? null : channelExpandLength.trim();
    }

    public String getMaintainStaff() {
        return maintainStaff;
    }

    public void setMaintainStaff(String maintainStaff) {
        this.maintainStaff = maintainStaff == null ? null : maintainStaff.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsPrepChannel() {
        return isPrepChannel;
    }

    public void setIsPrepChannel(String isPrepChannel) {
        this.isPrepChannel = isPrepChannel == null ? null : isPrepChannel.trim();
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    @Override
    public String toString() {
        return "DcmpChannelsMaintain{" +
                "id=" + id +
                ", onlinePlatform='" + onlinePlatform + '\'' +
                ", channelCode='" + channelCode + '\'' +
                ", channelName='" + channelName + '\'' +
                ", channelUserId='" + channelUserId + '\'' +
                ", channelStatus='" + channelStatus + '\'' +
                ", serviceProvider='" + serviceProvider + '\'' +
                ", spNumber='" + spNumber + '\'' +
                ", channelExpandLength='" + channelExpandLength + '\'' +
                ", isPrepChannel='" + isPrepChannel + '\'' +
                ", rksj=" + rksj +
                '}';
    }
}