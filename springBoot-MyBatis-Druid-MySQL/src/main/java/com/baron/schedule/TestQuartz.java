package com.baron.schedule;

import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

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
public class TestQuartz extends QuartzJobBean {


    /**
     * 执行定时任务
     * @param jobExecutionContext 任务
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        System.out.println("quartz task "+new Date());
    }
}
