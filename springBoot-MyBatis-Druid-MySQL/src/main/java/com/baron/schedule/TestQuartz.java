package com.baron.schedule;

import com.baron.service.WeatherService;
import com.baron.weather.WeatherUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 测试 Quartz：这是一个功能比较强大的的调度器，可以让你的程序在指定时间执行，也可以按照某一个频度执行，配置起来稍显复杂。
 *
 * 第一步：导入依赖，如果SpringBoot版本是2.0.0以后的，则在spring-boot-starter中已经包含了quart的依赖，则可以直接使用spring-boot-starter-quartz依赖
 * <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter-quartz</artifactId>
 * </dependency>
 *
 * 第二步：创建任务类 {@link com.baron.schedule.TestQuartz}，该类主要是继承了抽象类 {@link org.springframework.scheduling.quartz.QuartzJobBean}
 * 第三步：创建配置类 {@link com.baron.schedule.TestQuartz}
 * 第四步：启动项目
 *
 * @author Baron
 * @date 2020/9/2 21:02
 */
@Slf4j
public class TestQuartz extends QuartzJobBean {

    @Autowired
    private WeatherService weatherService ;

    /**
     * 执行定时任务
     * @param jobExecutionContext 任务
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        System.out.println("quartz task "+new Date());
        WeatherUtils weatherUtils = new WeatherUtils();
        try {
            Map<String,List> listMap = weatherUtils.getCityList();
            for (Map.Entry<String,List> entry : listMap.entrySet()){
                List<String > list = entry.getValue();
                for (String cityName : list){
                    System.out.println(cityName);
                     weatherService.insertOne(cityName);
                }
            }
        } catch (IOException e) {
            // 打印日志，但是不抛出异常
            log.error(e.getMessage());
        }
    }
}
