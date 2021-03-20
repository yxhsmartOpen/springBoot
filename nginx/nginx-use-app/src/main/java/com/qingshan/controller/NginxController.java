package com.qingshan.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class NginxController {

    // 访问 http://192.168.71.128/user/query
    @RequestMapping("user/query")
    public String query(HttpServletRequest request){
/*        Enumeration<String> headNames = request.getHeaderNames();
        while(headNames.hasMoreElements()){
            String headName = headNames.nextElement();
            System.out.println(headName+":"+request.getHeader(headName));
        }

        System.out.println("客户端IP : "+request.getHeader("X-Real-IP"));
        System.out.println("X-Forwarded-For : "+request.getHeader("X-Forwarded-For"));
        */
        System.out.println("访问到Controller");
        return "nice";
    }

    // 访问 http://192.168.44.181/time/query
    @ResponseBody
    @RequestMapping("time/query")
    public String time(HttpServletResponse response) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        System.out.println(dateString);

        JSONObject json = new JSONObject();
        json.put("time", dateString);
        return json.toJSONString();
        //return "successCallback("+json.toJSONString()+")";
    }

    // 访问 http://192.168.44.181/file/get
    @GetMapping("/file/get")
    public Map<String, Object> getUser() {
        System.out.println("Enter /file/get");
        Map<String, Object> result = new HashMap<>();
        result.put("code", "000000");
        result.put("message", "OK");
        try {
            FileInputStream in = new FileInputStream("D:/天龙八部.txt");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int len =-1;
            byte[] b = new byte[1024];
            while((len=in.read(b))!=-1){
                out.write(b, 0, len);
            }
            result.put("body", out.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    // 访问 http://192.168.71.128/html/get
    @RequestMapping("/html/get")
    public ModelAndView index(){
        System.out.println("html Controller");
        return new ModelAndView("index");
    }

    // 访问 http://192.168.71.128:9096/cross/get1
    @RequestMapping("/cross/get1")
    public ModelAndView cross(){
        System.out.println("cross1 Controller");
        return new ModelAndView("cross1");
    }

    // 访问 http://192.168.44.181/cross/get ，映射到 9097 tomcat
    @RequestMapping("/cross/get2")
    public ModelAndView cross2(){
        System.out.println("cross2 Controller");
        return new ModelAndView("cross2");
    }


}
