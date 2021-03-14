package com.baron.io.netty.tomcat.nio.servlet;

import com.baron.io.netty.tomcat.nio.http.GPRequest;
import com.baron.io.netty.tomcat.nio.http.GPResponse;
import com.baron.io.netty.tomcat.nio.http.GPServlet;

public class FirstServlet extends GPServlet {
    @Override
    public void doGet(GPRequest request, GPResponse response) throws Exception {
        this.doPost(request,response);
    }

    @Override
    public void doPost(GPRequest request, GPResponse response) throws Exception {
       response.write("This is first servlet from NIO.");
    }
}
