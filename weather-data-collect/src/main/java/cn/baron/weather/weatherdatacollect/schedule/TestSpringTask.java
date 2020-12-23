package cn.baron.weather.weatherdatacollect.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 测试 Spring Task：他是Spring3.0以后自带的task，可以将它看成一个轻量级的Quartz，而且使用起来比Quartz简单许多。
 *
 * 导入依赖：
 * <dependencies>
 *   <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter-web</artifactId>
 *   </dependency>
 *   <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter</artifactId>
 *   </dependency>
 *   <dependency>
 *     <groupId>org.projectlombok</groupId>
 *     <artifactId>lombok</artifactId>
 *     <optional>true</optional>
 *   </dependency>
 *   <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter-test</artifactId>
 *     <scope>test</scope>
 *   </dependency>
 * </dependencies>
 *
 * 使用方式一：简单的定时任务
 * 在 启动类 上使用@EnableScheduling注解开启对定时任务的支持，然后启动项目
 * 可以看到三个定时任务都已经执行，并且使同一个线程中串行执行，如果只有一个定时任务，这样做肯定没问题，当定时任务增多，如果一个任务卡死，会导致其他任务也无法执行。
 *
 * 使用方式二：多线程执行
 * 在传统的Spring项目中，我们可以在xml配置文件添加task的配置，而在SpringBoot项目中一般使用config配置类的方式添加配置，所以新建一个AsyncConfig类
 * {@link org.springframework.context.annotation.Configuration}注解：表明该类是一个配置类
 * {@link org.springframework.scheduling.annotation.EnableAsync}注解：开启异步事件的支持
 * 然后在定时任务的类（我们这里还是使用的{@link TestSpringTask}）或者方法上添加@Async 。最后重启项目，每一个任务都是在不同的线程中
 * 方法二是在方法一的基础上做了功能加强
 *
 * 注解参数功能说明：
 * 使用 @Scheduled(fixedRate = 5000) 注解：上一次开始执行时间点之后 5 秒再执行（fixedRate 属性：定时任务开始后再次执行定时任务的延时（需等待上次定时任务完成），单位毫秒）
 * 使用 @Scheduled(fixedDelay = 5000) 注解 ：上一次执行完毕时间点之后 5 秒再执行（fixedDelay 属性：定时任务执行完成后再次执行定时任务的延时（需等待上次定时任务完成）， 单位毫秒）
 * 使用 @Scheduled(initialDelay = 1000, fixedRate = 3000) 注解 ：第一次延迟1秒后执行，之后按 fixedRate 的规则每 3 秒执行
 *                        次（ initialDelay 属性：第一次执行定时任务的延迟时间，需配合 fixedDelay 或者 fixedRate 来使用）
 * 一 @Scheduled(cron = "0/5 * * * * *") ：通过 cron 表达式定义规则
 *
 * PS:如果对 fixedRate  和 fixedDelay 这两个参数的作用，是到底不是等待上一次任务执行完成再执行，可以参考如下的工程，测试 springboot-reactive-redis
 *
 * PS：为了不和 Quartz 实现的定时调度任务冲突，我暂时将 启动类上的注解 {@link org.springframework.scheduling.annotation.EnableScheduling} 去掉了，
 * 如果需要再次测试该功能排除 quartz 实现的定时任务的影响，在启动类上加再加上即可。
 * @author Baron
 * @date 2020/9/2 20:51
 */
@Slf4j
@Component
@Async
public class TestSpringTask {
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled(){
        log.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 5000)
    public void scheduled2() {
        log.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
    }
}
