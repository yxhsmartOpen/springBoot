package com.baron.io.netty.tomcat.bio.servlet;


import com.baron.io.netty.tomcat.bio.http.BaronRequestBio;
import com.baron.io.netty.tomcat.bio.http.BaronResponseBio;
import com.baron.io.netty.tomcat.bio.http.AbstractBaronServletBio;

/**
 * @author yangxuanhua
 */
public class FirstServletBioAbstract extends AbstractBaronServletBio {
    @Override
    public void doGet(BaronRequestBio request, BaronResponseBio response) throws Exception {
        this.doPost(request,response);
    }

    @Override
    public void doPost(BaronRequestBio request, BaronResponseBio response) throws Exception {
       response.write("This is first servlet from BIO.");
    }
}
