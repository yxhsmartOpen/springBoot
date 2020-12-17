package cn.baron.redisson;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Baron
 * @date 2020/12/17 11:21
 */
@ConfigurationProperties(prefix = "baron.redission")
public class RedissonProperties {

    private String host="localhost";
    private int port=6379;
    private int timeout; //超时时间
    private boolean ssl;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }
}
