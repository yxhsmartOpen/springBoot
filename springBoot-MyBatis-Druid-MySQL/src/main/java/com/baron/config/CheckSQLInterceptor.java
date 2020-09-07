package com.baron.config;

import com.baron.plugins.MyBatisPlugins;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Baron
 * @date 2020/9/6 15:45
 */
@Configuration
public class CheckSQLInterceptor {

    @Bean
    public Interceptor getIntercepts(){
        return new MyBatisPlugins();
    }
}
