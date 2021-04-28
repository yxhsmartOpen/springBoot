package com.baron.springboot.bean;

public class RequestHead {
 //密钥
    private String secretId;
    private String timestamp;
    private String sign;

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
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

    @Override
    public String toString() {
        return "RequestHead [secretId=" + secretId + ", timestamp=" + timestamp + ", sign=" + sign + "]";
    }

}
