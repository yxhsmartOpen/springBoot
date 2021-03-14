package com.baron.kafka.sb.kafkaspringboot;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication(exclude = {MybatisAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class
,H2ConsoleAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class KafkaSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringbootApplication.class, args);
    }

}
