package com.baron.springboot.util;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author yangxuanhua
 * @since v1.0
 */
public class CmupApiUtils {
    /**
     * @Title: md5Base64
     * @Description: 用于签名生成
     * @author: dmf
     * @param str
     * @throws NoSuchAlgorithmException
     * @return: String
     */
    public static String md5Base64(String str) throws NoSuchAlgorithmException {
        // string 编码必须为utf-8
        byte[] utfBytes = str.getBytes(StandardCharsets.UTF_8);
        MessageDigest mdTemp = MessageDigest.getInstance("MD5");
        mdTemp.update(utfBytes);
        byte[] md5Bytes = mdTemp.digest();
        return Base64.encodeBase64String(md5Bytes);
    }
    /**
     * @Title: sign
     * @Description: 生成签名
     * @author: dmf
     * @param tokenId
     * @param timestamp
     * @return: String
     */
    public static String sign(String tokenId, String timestamp) {
        String sign = "";
        // 将 tokenId=xxx&timestamp=xxx&sign=xxx
        try {
            sign = URLEncoder.encode(md5Base64("tokenId=" + tokenId + "&timestamp=" + timestamp), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sign;
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        String sign = CmupApiUtils.sign("xxx","13224546782121135");
        System.out.println(sign);

        System.out.println(URLDecoder.decode(sign,"utf-8"));

        String xxx = "CJK7AoM/XnWU8bXYiRTfVQ==";
        System.out.println(URLEncoder.encode(xxx,"utf-8"));
    }
}
