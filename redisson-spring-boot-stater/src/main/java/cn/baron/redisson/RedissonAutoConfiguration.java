package cn.baron.redisson;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Baron
 * @date 2020/12/17 11:19
 */
@ConditionalOnClass(Redisson.class) //条件装配
@EnableConfigurationProperties(RedissonProperties.class)
@Configuration
public class RedissonAutoConfiguration {

    @Bean
    RedissonClient getRedisClient(RedissonProperties redissonProperties){
        Config config = new Config();
        String prefix="redis://";
        if(redissonProperties.isSsl()){
            prefix="redis://";
        }
        config.useSingleServer().
                setAddress(prefix+redissonProperties.getHost()+":"+redissonProperties.getPort()).
                setConnectTimeout(redissonProperties.getTimeout());

        return Redisson.create(config);
    }
}
