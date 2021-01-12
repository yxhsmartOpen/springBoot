package cn.baron.weather.weatherdatacollect.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author Baron
 * @date 2020/9/2 21:07
 */
@Configuration
@EnableAsync
@Slf4j
public class AsyncConfig {

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        /*
   此处成员变量应该使用@Value从配置中读取
    */
        int corePoolSize = 10;
        executor.setCorePoolSize(corePoolSize);
        int maxPoolSize = 200;
        executor.setMaxPoolSize(maxPoolSize);
        int queueCapacity = 10;
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
    }

}
