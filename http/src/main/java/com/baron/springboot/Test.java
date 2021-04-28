package com.baron.springboot;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baron.springboot.util.CmupApiUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@Slf4j
public class Test {

    public static void main(String[] args) {

//        String url = "http://localhost:8085/http/receiveSubPlatformChannelData";
//        hah(url);

        String url = "http://localhost:8082/cmup/infterface/receiveSubPlatformChannelData";
        hah(url);
        //xxx(url);
    }

    public static void hah(String url) {
        log.info("调用接口开始..................................");

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


            List<SubPlatformChannel> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                SubPlatformChannel channel = new SubPlatformChannel();
                channel.setChannelCode("asd" + i);
                channel.setChannelStatus("0");
                channel.setChannelUserId("zxc" + i);
                channel.setService("移动");
                channel.setOnlinePlatform("移动" + i + "子平台");
                channel.setOnlinePlatformCode("YD12");
                channel.setChannelName("fds" + i + "fsd");
                channel.setChannelUserId("abcd" + i);
                channel.setExpandLength("12");
                channel.setIsPrepChannel("hahhah");
                channel.setOpType("2");
                list.add(channel);
            }

            UserInfoVo vo = new UserInfoVo();
            vo.setCount(list.size()+"");
            vo.setList(list);
            vo.setTokenId("xxx");
            vo.setTimestamp("13224546782121135");
            System.out.println(CmupApiUtils.sign("xxx","13224546782121135"));
            vo.setSign(CmupApiUtils.sign("xxx","13224546782121135"));
            System.out.println(JSONObject.toJSONString(vo, SerializerFeature.WriteMapNullValue));
            StringEntity entity = new StringEntity(JSONObject.toJSONString(vo, SerializerFeature.WriteMapNullValue), StandardCharsets.UTF_8);
            //设置参数格式为json
            entity.setContentType("application/json");
            httpPost.setEntity(entity);

            // 执行http请求
            httpResponse = httpClient.execute(httpPost);

            //获得返回值
            resultStr = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            //转为json格式
            JSONObject json = JSONObject.parseObject(resultStr);
            System.out.println(json.toJSONString());
            //获得数据
            String ststus = json.getString("status");
            if ("ok".equals(ststus)){
                String insertCount = json.getString("insertCount");
                String updateCount = json.getString("updateCount");
                System.out.println(insertCount + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println(updateCount + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
            System.out.println(ststus + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            log.info("调用接口结束..................................");
        } catch (Exception e) {
            log.error("getMarketByList exception", e);
        }

    }

    public static void xxx(String url) {
        List<SubPlatformChannel> list = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            SubPlatformChannel channel = new SubPlatformChannel();
            channel.setChannelCode("asd" + i);
            channel.setChannelStatus("1");
            channel.setChannelUserId("zxc" + i);
            channel.setService("移动");
            channel.setOnlinePlatform("移动" + i + "子平台");
            channel.setChannelName("fds" + i + "fsd");
            channel.setChannelUserId("abcd" + i);
            channel.setExpandLength("12");
            channel.setIsPrepChannel("hahhah");

            list.add(channel);
        }

        UserInfoVo vo = new UserInfoVo();
        vo.setCount("ok");
        vo.setList(list);
        String jsonStr = JSONObject.toJSONString(vo, SerializerFeature.WriteMapNullValue);
        String resultStr = HttpClientUtil.doPostJson(url,jsonStr);
        //转为json格式
        JSONObject json = JSONObject.parseObject(resultStr);
        //获得数据
        String ststus = json.getString("status");
        System.out.println(ststus + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
