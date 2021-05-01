package com.baron.springboot;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author yangxuanhua
 * @since v1.0
 */
//@Component
public class TimeInterceptor implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        request.getMethod();


//        //通过handler
//        HandlerMethod h = (HandlerMethod) handler;
//        //获取接口上的reqeustmapping注解
//        RequestMapping annotation = h.getMethodAnnotation(RequestMapping.class);
//        //获取当前请求接口中的name属性
//        RequestMethod[] methods = annotation.method();
//        System.out.println(methods);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
