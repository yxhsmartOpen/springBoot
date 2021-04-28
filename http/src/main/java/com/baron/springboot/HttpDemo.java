package com.baron.springboot;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.baron.springboot.bean.RequestHead;
import com.baron.springboot.bean.SignOperateUtil;
import com.baron.springboot.bean.UserRequestBody;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yangxuanhua
 * @since v1.0
 */
@SpringBootApplication(exclude = {SpringApplicationAdminJmxAutoConfiguration.class,
        ApplicationAvailabilityAutoConfiguration.class, DataSourceAutoConfiguration.class})
@Controller
@RequestMapping("/http")
@Slf4j
public class HttpDemo {
    @Value("${5G_SECRET_KEY}")
    private String FIVEG_SECRET_KEY;
    public static void main(String[] args) {
        SpringApplication.run(HttpDemo.class, args);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void test(HttpServletRequest request, HttpServletResponse response){
        log.info("调用user接口。。。。。。。。开始");
        PrintWriter out = null;
        JSONObject jsonObject = new JSONObject();
        try {
            request.setCharacterEncoding("UTF-8");
            response.setHeader("Pragma", "No-Cache");
            response.setHeader("Cache-Control", "No-Cache");
            response.setHeader("Content-Type", "application/json; charset=utf-8");
            response.setHeader("Accept", "application/json");
            response.setCharacterEncoding("utf-8");
            out = response.getWriter();
            String receivePostStr = HttpClientUtil.receivePost(request);
            JSONObject receiveObject = JSONObject.parseObject(receivePostStr);
            String receiveListStr = receiveObject.getString("list");
            ArrayList<SubPlatformChannel> list = JSON.parseObject(receiveListStr, new TypeReference<ArrayList<SubPlatformChannel>>(){});
            list.forEach(c -> log.info("SubPlatformChannel {}", c));
            jsonObject.put("status", "ok");
            out.print(JSONObject.toJSONString(jsonObject));
        }catch (Exception e){
            jsonObject.put("status", "ERROR");
            out.print(JSONObject.toJSONString(jsonObject));
            log.info("调用接口发生异常",e);
        }
    }


    /**
     * 接收子平台主动推送过来的通道数据
     *
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     */
    @RequestMapping(value = "/receiveSubPlatformChannelData",method = RequestMethod.POST)
    @ResponseBody
    public void receiveSubPlatformChannelData(HttpServletRequest request, HttpServletResponse response) {
        log.info("接收到推送数据开始..................................");
        PrintWriter out = null;
        JSONObject jsonObject = new JSONObject();
        try {
            request.setCharacterEncoding("UTF-8");
            response.setHeader("Pragma", "No-Cache");
            response.setHeader("Cache-Control", "No-Cache");
            response.setHeader("Content-Type", "application/json; charset=utf-8");
            response.setHeader("Accept", "application/json");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            String receivePostStr = HttpClientUtil.receivePost(request);
            JSONObject receiveObject = JSONObject.parseObject(receivePostStr);
            String receiveListStr = receiveObject.getString("list");
//            String receiveListStr = receiveObject.getString("list");
//            String receiveListStr = receiveObject.getString("list");
            ArrayList<SubPlatformChannel> list = JSON.parseObject(receiveListStr, new TypeReference<ArrayList<SubPlatformChannel>>() {
            });
            if (list.size() < 1) {
                jsonObject.put("status", "ok");
                jsonObject.put("insertCount", "0条");
                out.print(JSONObject.toJSONString(jsonObject));
                return;
            }
            // 查询通道维护主表主键最大值
//            Long maxId = maintainService.selectMaxId();
            List<DcmpChannelsMaintain> insetList = new ArrayList<>();
            for (SubPlatformChannel channel : list) {
                //解析入库
                DcmpChannelsMaintain maintain = new DcmpChannelsMaintain();
                if (StringUtils.isEmpty(channel.getChannelCode())) {
                    continue;
                }
                // 接收的参数
                maintain.setChannelCode(channel.getChannelCode());
                maintain.setChannelName(URLDecoder.decode(channel.getChannelName(), "UTF-8"));
                maintain.setChannelStatus(channel.getChannelStatus());
                maintain.setChannelUserId(channel.getChannelUserId());
                maintain.setOnlinePlatform(URLDecoder.decode(channel.getOnlinePlatform(), "UTF-8"));
                maintain.setChannelExpandLength(channel.getExpandLength());
                maintain.setServiceProvider(URLDecoder.decode(channel.getService(), "UTF-8"));
                maintain.setIsPrepChannel(channel.getIsPrepChannel());
                maintain.setSpNumber(channel.getSpNumber());

                // 其他入库字段
                maintain.setRksj(new Date());
                // 主键 id
//                maintain.setId(maxId);
                insetList.add(maintain);
            }
            list.forEach(c -> log.info("DcmpChannelsMaintain {}", c.toString()));
            // 批量插入
//            maintainService.insertBatch(insetList);
            jsonObject.put("status", "ok");
            jsonObject.put("insertCount", insetList.size() + "条");
            out.print(JSONObject.toJSONString(jsonObject));
            log.info("接收到推送数据结束..................................");
        } catch (Exception e) {
            jsonObject.put("status", "Error");
            out.print(JSONObject.toJSONString(jsonObject));
            log.error("addChannel exception", e);
        }
    }

    private String getUserSMSSign(String secretId, String timestamp, String mobile) {
        String signPd = "";
        try {
            RequestHead head = new RequestHead();
            head.setSecretId(secretId);
            head.setTimestamp(timestamp);
            UserRequestBody body = new UserRequestBody();
            body.setMobile(mobile);
            String secretKey = Base64.encode(FIVEG_SECRET_KEY.trim().substring(0, 16).getBytes(StandardCharsets.UTF_8));
            signPd = SignOperateUtil.getSign(head, body, secretKey);
        } catch (Exception e) {
            log.error("getNewSMSSign exception", e);
        }
        return signPd;
    }
}
