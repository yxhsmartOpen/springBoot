package com.baron.io.netty.tomcat.nio.servlet;

import com.baron.io.netty.tomcat.nio.http.BaronRequestNio;
import com.baron.io.netty.tomcat.nio.http.BaronResponseNio;
import com.baron.io.netty.tomcat.nio.http.AbstractBaronServletNio;

public class FirstServletNioAbstract extends AbstractBaronServletNio {
    @Override
    public void doGet(BaronRequestNio request, BaronResponseNio response) throws Exception {
        this.doPost(request,response);
    }

    @Override
    public void doPost(BaronRequestNio request, BaronResponseNio response) throws Exception {
       response.write("This is first servlet from NIO.");
    }
}
