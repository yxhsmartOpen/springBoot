package com.baron.io.netty.tomcat.bio.servlet;


import com.baron.io.netty.tomcat.bio.http.GPRequest;
import com.baron.io.netty.tomcat.bio.http.GPResponse;
import com.baron.io.netty.tomcat.bio.http.GPServlet;

public class MyServlet extends GPServlet {
    @Override
    public void doGet(GPRequest request, GPResponse response) throws Exception {
        this.doPost(request,response);
    }

    @Override
    public void doPost(GPRequest request, GPResponse response) throws Exception {
        response.write("This is my servlet from BIO.");
    }
}
