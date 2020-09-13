package cn.baron.redis.lock;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * @author Baron
 * @date 2020/9/12 23:13
 */
public class JedisFactory {

    private RedisConnectionFactory redisConnectionFactory;

    private JedisFactory(){}

    private static RedisProperties.Jedis jedis;
}
