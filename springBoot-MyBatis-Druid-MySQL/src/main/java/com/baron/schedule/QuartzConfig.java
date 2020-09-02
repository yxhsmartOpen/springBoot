package com.baron.schedule;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Baron
 * @date 2020/9/2 21:40
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail testQuartzDetail() {
        return JobBuilder.
                newJob(TestQuartz.class).
                withIdentity("testQuartz").
                storeDurably().build();
    }

    @Bean
    public Trigger testQuartzTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.
                simpleSchedule().
                /*设置时间周期单位秒,这里还有其他三种时间范围可供选择 */
                withIntervalInSeconds(10).
                repeatForever();

        return TriggerBuilder.newTrigger().forJob(testQuartzDetail())
                        .withIdentity("testQuartz")
                        .withSchedule(scheduleBuilder)
                        .build();
    }
}
