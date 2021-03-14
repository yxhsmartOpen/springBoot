package com.baron.io.netty.tomcat.bio;



import com.baron.io.netty.tomcat.bio.http.BaronRequestBio;
import com.baron.io.netty.tomcat.bio.http.BaronResponseBio;
import com.baron.io.netty.tomcat.bio.http.AbstractBaronServletBio;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaronTomcatBio {

    private int port = 8080;

    private ServerSocket server;

    private Properties webxml = new Properties();

    private Map<String, AbstractBaronServletBio> servletMapping = new HashMap<String, AbstractBaronServletBio>();

    public static void main(String[] args) {
        new BaronTomcatBio().start();
    }

    //Tomcat的启动入口
    private void start() {
        //1、加载web.properties文件，解析配置
        init();

        //2、启动服务端Socket，等待用户请求
        try {
            server = new ServerSocket(this.port);

            System.out.println("GP Tomcat 已启动，监听端口是：" + this.port);

            while (true){
                Socket client = server.accept();

                //3、获得请求信息，解析HTTP协议内容
                process(client);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void process(Socket client) throws Exception{

        InputStream is = client.getInputStream();
        OutputStream os = client.getOutputStream();

        BaronRequestBio request = new BaronRequestBio(is);
        BaronResponseBio response = new BaronResponseBio(os);

        String url = request.getUrl();

        if(servletMapping.containsKey(url)){
            servletMapping.get(url).service(request,response);
        }else {
            response.write("404 - Not Found!!");
        }

        os.flush();
        os.close();

        is.close();
        client.close();

    }

    private void init() {
        try {
            String WEB_INF = this.getClass().getResource("/").getPath();
            FileInputStream fis = new FileInputStream(WEB_INF + "web-bio.properties");

            webxml.load(fis);

            for (Object k : webxml.keySet()) {

                String key = k.toString();

                if(key.endsWith(".url")){

                    //将 servlet.xxx.url 的 .url 替换，只剩下 servlet.xxx当成  servletName
                    String servletName = key.replaceAll("\\.url$","");
                    String url = webxml.getProperty(key);

                    //
                    //拿到Serlvet的全类名
                    String className = webxml.getProperty(servletName + ".className");

                    //反射创建Servlet的实例
                    AbstractBaronServletBio obj = (AbstractBaronServletBio) Class.forName(className).newInstance();
                    //将URL和Servlet建立映射关系
                    servletMapping.put(url,obj);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
