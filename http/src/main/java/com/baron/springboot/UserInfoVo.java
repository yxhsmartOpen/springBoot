package com.baron.springboot;

import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
public class UserInfoVo {
    /**提交数据条数*/
    private String count;
    private String tokenId;
    /**时间戳*/
    private String timestamp;
    /**签名*/
    private String sign;
    private List<SubPlatformChannel> list;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<SubPlatformChannel> getList() {
        return list;
    }

    public void setList(List<SubPlatformChannel> list) {
        this.list = list;
    }


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
