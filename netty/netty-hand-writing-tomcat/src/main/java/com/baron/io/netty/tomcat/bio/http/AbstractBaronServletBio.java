package com.baron.io.netty.tomcat.bio.http;

/**
 * @author yangxuanhua
 */
public abstract class AbstractBaronServletBio {

    public void service(BaronRequestBio request, BaronResponseBio response) throws Exception{
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }else {
            doPost(request,response);
        }
    }


    public abstract void doGet(BaronRequestBio request, BaronResponseBio response) throws Exception;

    public abstract void doPost(BaronRequestBio request, BaronResponseBio response) throws Exception;

}
