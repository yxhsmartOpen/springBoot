package com.baron.io.netty.tomcat.nio.http;

/**
 * @author yangxuanhua
 */
public abstract class AbstractBaronServletNio {

    public void service(BaronRequestNio request, BaronResponseNio response) throws Exception{
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }else {
            doPost(request,response);
        }
    }


    public abstract void doGet(BaronRequestNio request, BaronResponseNio response) throws Exception;

    public abstract void doPost(BaronRequestNio request, BaronResponseNio response) throws Exception;

}
