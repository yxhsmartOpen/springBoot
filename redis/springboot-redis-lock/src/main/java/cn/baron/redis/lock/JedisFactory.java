package cn.baron.redis.lock;


import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Baron
 * @date 2020/9/12 23:13
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
public class JedisFactory {

    @Autowired
    RedissonClient redissonClient;

    @GetMapping("/say")
    public String getUrl(){

        RBucket bucket=redissonClient.getBucket("name");
        if(bucket.get()==null){
            bucket.set("baron.com");
        }
        return bucket.get().toString();
    }
    public static void main(String[] args) {
        SpringApplication.run(JedisFactory.class, args);
    }
}
