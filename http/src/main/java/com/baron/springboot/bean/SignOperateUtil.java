package com.baron.springboot.bean;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


@Slf4j
public class SignOperateUtil {

    private final static String CHARSET = "UTF-8";

    @SuppressWarnings("unchecked")
    private static TreeMap<String, Object> getTreeMap(RequestHead head, Object body) {
        Map<String, Object> headMap = (Map<String, Object>) JSON.toJSON(head);
        System.out.println(headMap);
        Map<String, Object> bodyMap = transBean2Map(body);
        System.out.println(bodyMap);
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
        treeMap.putAll(headMap);
        treeMap.putAll(bodyMap);
        return treeMap;
    }

    /**
     * 剔除去数组类实体类等
     *
     * @param obj
     * @return
     */
    public static Map<String, Object> transBean2Map(Object obj) {
        System.out.println("body2:"+obj);
        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                if (!key.equals("class")) {
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    if (value != null && value.getClass().getSimpleName().equals("String")) {
                        map.put(key, value);
                    }
                }
            }
        } catch (Exception e) {
        }
        return map;
    }

    /**
     * 数据为集合M，将集合M内非空参数值的参数按照参数名ASCII码从小到大排序（字典序），
     * 使用URL键值对的格式（即key1=value1&key2=value2…）拼接成字符串
     *
     * @param treeMap 生成签名的参数集合
     * @return String
     */
    private static String mapToStr(TreeMap<String, Object> treeMap, String secretKey) {
        treeMap.remove("sign");
        StringBuilder builder = new StringBuilder();
        for (String key : treeMap.keySet()) {
            Object value = treeMap.get(key).toString();
            if (null != key && (key = key.trim()).length() > 0 && null != value
                    && (value = value.toString().trim()).toString().length() > 0) {
                builder.append(key).append("=").append(value).append("&");
            } else {
                continue;
            }
        }
        return builder.append("secretKey=").append(secretKey).toString();
    }

    /**
     * 根据算法生成签名
     *
     * @param str    签名前字符串
     * @param key    秘钥
     * @param method 算法方式
     * @return sign 签名串
     */
    private static String getSignStr(String str, String key, String method) {
        try {
            Mac mac = Mac.getInstance(method);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(CHARSET), mac.getAlgorithm());
            mac.init(secretKeySpec);
            byte[] hash = mac.doFinal(str.getBytes(CHARSET));
            return DatatypeConverter.printBase64Binary(hash);
        } catch (Exception e) {
            log.error("鉴权算法失败", e);
        }
        return null;
    }

    /**
     * 获取鉴权sign
     *
     * @param head
     * @param body
     * @param secretKey
     * @return
     * @throws Exception
     */
    public static String getSign(RequestHead head, Object body, String secretKey) {
        /**
         * 将请求头请求体排序
         */
        TreeMap<String, Object> treeMap = SignOperateUtil.getTreeMap(head, body);
        System.out.println("treeMap:" + treeMap);
        /**
         * 将参数组装成url 形式
         */
        String urlStr = mapToStr(treeMap, secretKey);
        System.out.println("urlStr:" + urlStr);

        /**
         * 算法
         */
        return SignOperateUtil.getSignStr(urlStr, secretKey, "HmacSHA256");
    }
}
