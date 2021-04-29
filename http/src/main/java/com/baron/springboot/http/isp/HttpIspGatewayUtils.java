package com.baron.springboot.http.isp;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Slf4j
public class HttpIspGatewayUtils {

    public static void main(String[] args) {
        String mtUrl = "http://120.133.134.29/GsmsHttp";
        String fiveGMtUrl = "http://ip:port/i5GsmsHttp";
        String oneToOneMtUrl = "http://120.133.134.29/PointGsmsHttp";

    }

    /**
     * 下行(MT)短信
     * @param url 请求参数url
     * @param requestType 1：get请求 2：post请求
     */
    public static void mt(String url,String requestType){
        log.info("调用 mt 接口开始..................................");

        CloseableHttpResponse httpResponse;
        String resultStr;
        try {
            // 创建Httpclient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建Http Get请求
            HttpGet httpGet = new HttpGet(url);

            //设置请求头
            RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(15000)
                    .setSocketTimeout(15000).setConnectTimeout(15000).build();
            httpPost.setConfig(requestConfig);
            httpPost.addHeader("Content-type", "application/json; charset=UTF-8");
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Pragma", "No-Cache");
            httpPost.setHeader("Cache-Control", "No-Cache");

            httpGet.setConfig(requestConfig);
            httpGet.addHeader("Content-type", "application/json; charset=UTF-8");
            httpGet.setHeader("Accept", "application/json");
            httpGet.setHeader("Pragma", "No-Cache");
            httpGet.setHeader("Cache-Control", "No-Cache");

            Mt mt = new Mt();
            mt.setSign("13975410736");
            mt.setExpandPrefix("12235");
            mt.setContent("您有500元到账，请注意查收！");
            mt.setUsername("admin");
            mt.setPassword("1");
            mt.setFrom("13900000000");
            mt.setTo("13900000000");

            StringEntity entity = new StringEntity(JSONObject.toJSONString(mt), Charset.forName("GBK"));
            //设置参数格式为json
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            // 执行http请求
            httpResponse = httpClient.execute(httpPost);

            //获得返回值
            resultStr = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            //转为json格式
            JSONObject json = JSONObject.parseObject(resultStr);
            log.info(json.toJSONString());
            String OK,ERROR;
            List<FiveGMtReturn> resultList;
            if (json.containsKey("OK")){
                OK = json.getString("OK");
            }
            if (json.containsKey("ERROR")){
                ERROR = json.getString("ERROR");
            }

            // 进行后续逻辑

            log.info("调用 mt 接口结束..................................");
        } catch (Exception e) {
            log.error("fiveGMt exception", e);
        }

    }

    /**
     * 主动推送状态报告和上行发送信息
     */
    public static void activePushReport(){

    }

    /**
     * 一对一短信下行
     * @param url 请求接口url
     */
    public static void oneToOneMt(String url){
        log.info("调用oneToOneMt接口开始..................................");

        CloseableHttpResponse httpResponse;
        String resultStr;
        try {
            // 创建Httpclient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);

            //设置请求头
            RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(15000)
                    .setSocketTimeout(15000).setConnectTimeout(15000).build();
            httpPost.setConfig(requestConfig);
            httpPost.addHeader("Content-type", "application/json; charset=UTF-8");
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Pragma", "No-Cache");
            httpPost.setHeader("Cache-Control", "No-Cache");

            List<oneToOneMt> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                oneToOneMt fiveGMt = new oneToOneMt();
                fiveGMt.setToMobile("13975410736");
                fiveGMt.setExtPort("12235");
                fiveGMt.setContent("您有500元到账，请注意查收！");

                list.add(fiveGMt);
            }

            oneToOneMtVo vo = new oneToOneMtVo();
            vo.setUsername("admin");
            vo.setPassword("1");
            vo.setList(list);

            StringEntity entity = new StringEntity(JSONObject.toJSONString(vo), Charset.forName("GBK"));
            //设置参数格式为json
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            // 执行http请求
            httpResponse = httpClient.execute(httpPost);

            //获得返回值
            resultStr = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            //转为json格式
            JSONObject json = JSONObject.parseObject(resultStr);
            log.info(json.toJSONString());
            String code,desc;
            List<FiveGMtReturn> resultList;
            if (json.containsKey("code")){
                code = json.getString("code");
            }
            if (json.containsKey("desc")){
                desc = json.getString("desc");
            }
            if (json.containsKey("list")){
                resultList = json.getObject("list", new TypeReference<FiveGMtReturn>(){} );
            }
            // 进行后续逻辑

            log.info("调用oneToOneMt接口结束..................................");
        } catch (Exception e) {
            log.error("fiveGMt exception", e);
        }
    }

    /**
     * 5G下行短信编写
     * @param url 请求url
     */
    public static void fiveGMt(String url){
        log.info("调用fiveGMt接口开始..................................");

        CloseableHttpResponse httpResponse;
        String resultStr;
        try {
            // 创建Httpclient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);

            //设置请求头
            RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(15000)
                    .setSocketTimeout(15000).setConnectTimeout(15000).build();
            httpPost.setConfig(requestConfig);
            httpPost.addHeader("Content-type", "application/json; charset=UTF-8");
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Pragma", "No-Cache");
            httpPost.setHeader("Cache-Control", "No-Cache");

            List<FiveGMt> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                FiveGMt fiveGMt = new FiveGMt();
                fiveGMt.setToMobile("13975410736");
                fiveGMt.setTitle("无敌金刚炮");
                fiveGMt.setTemplateId("123");
                fiveGMt.setTabContent("不是金刚钻，别揽瓷器活");
                fiveGMt.setAbstractContent("凡赛尔");
                fiveGMt.setContent("您有500元到账，请注意查收！");

                list.add(fiveGMt);
            }

            FiveGMtVo vo = new FiveGMtVo();
            vo.setUsername("admin");
            vo.setPassword("1");
            vo.setList(list);

            StringEntity entity = new StringEntity(JSONObject.toJSONString(vo), Charset.forName("GBK"));
            //设置参数格式为json
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            // 执行http请求
            httpResponse = httpClient.execute(httpPost);

            //获得返回值
            resultStr = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            //转为json格式
            JSONObject json = JSONObject.parseObject(resultStr);
            log.info(json.toJSONString());
            String code,desc;
            List<FiveGMtReturn> resultList;
            if (json.containsKey("code")){
                code = json.getString("code");
            }
            if (json.containsKey("desc")){
                desc = json.getString("desc");
            }
            if (json.containsKey("list")){
                resultList = json.getObject("list", new TypeReference<FiveGMtReturn>(){} );
            }
            // 进行后续逻辑

            log.info("调用fiveGMt接口结束..................................");
        } catch (Exception e) {
            log.error("fiveGMt exception", e);
        }
    }
}
