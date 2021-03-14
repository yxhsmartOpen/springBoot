package com.baron.io.netty.tomcat.nio.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.QueryStringDecoder;

import java.util.List;
import java.util.Map;


/**
 * @author yangxuanhua
 */
public class GPRequest {

    private ChannelHandlerContext ctx;
    private HttpRequest req;

    public GPRequest(ChannelHandlerContext ctx, HttpRequest req) {
        this.ctx = ctx;
        this.req = req;
    }

    public String getUrl(){
        return this.req.uri();
    }
    public String getMethod(){
        return this.req.method().name();
    }

    public Map<String, List<String>> getParameters(){
        QueryStringDecoder decoder = new QueryStringDecoder(req.uri());
        return decoder.parameters();
    }

    public String getParameter(String name){
        Map<String,List<String >> params = getParameters();
        List<String> param = params.get(name);
        if(null == param){
            return null;
        }else {
            return param.get(0);
        }
    }

}
