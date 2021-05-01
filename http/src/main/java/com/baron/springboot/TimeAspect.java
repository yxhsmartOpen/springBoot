package com.baron.springboot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;


/**
 * @author yangxuanhua
 * @since v1.0
 */
//@Aspect
//@Component
public class TimeAspect {
    @Around("execution(* com.baron.springboot.HttpDemo.receiveSubPlatformChannelData())")
    public Object handlerControllerMethod(ProceedingJoinPoint point) throws Throwable {
        System.out.println("time aspect start");
        long start = System.currentTimeMillis();
        Object[] args = point.getArgs();
        for (Object obj : args) {
            System.out.println("arg is:" + obj);
        }
        //具体方法的返回值
        Object obj = point.proceed();
        System.out.println("aspect 耗时：" + (System.currentTimeMillis() - start));
        System.out.println("time aspect end");

        Object target=point.getTarget();
        HttpServletRequest retValue;
        try {
            Method reqMethod = target.getClass().getMethod("test");
            retValue = (HttpServletRequest) reqMethod.invoke(target);
            System.out.println(retValue);
        }catch (Exception e){
            System.out.println("xxxxxx");
        }
        return obj;

    }
}
