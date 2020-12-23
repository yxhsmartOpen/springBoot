package cn.baron.weather.weatherdatacollect.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试 这是java自带的{@link Timer}类，这个类允许你调度一个{@link TimerTask}任务。
 * 使用这种方式可以让你的程序按照某一个频度执行，但不能在指定时间运行。一般用的较少。
 * @author Baron
 * @date 2020/9/2 20:35
 */
public class TestTimer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task  run:"+ new Date());
            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每3秒执行一次
        timer.schedule(timerTask,10,3000);
    }
}
