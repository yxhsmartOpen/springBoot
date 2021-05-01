package com.baron.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yangxuanhua
 * @since v1.0
 */
//@Component
public class JwtInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

        //通过handler
        HandlerMethod h = (HandlerMethod) handler;
        //获取接口上的reqeustmapping注解
        RequestMapping annotation = h.getMethodAnnotation(RequestMapping.class);
        //获取当前请求接口中的name属性
        RequestMethod[] methods = annotation.method();
        System.out.println(methods);
        //判断当前用户是否具有响应的请求权限
        System.out.println(request.getMethod()+"xxxxxxx");
    }

    /**
     *Thisimplementationisempty.
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
    {
    }
}
