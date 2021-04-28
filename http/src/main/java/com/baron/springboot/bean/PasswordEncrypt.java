package com.baron.springboot.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * 33E9密码加密规则工具类
 * @Description 
 * @Project: NOP
 * @Date:2016-5-5
 * @Author wwei
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
@Slf4j
public class PasswordEncrypt {

    private static PasswordEncrypt instance = null;
    
    public static PasswordEncrypt getInstance() {
        if (instance == null) {
            synchronized (PasswordEncrypt.class) {
                if (instance == null) {
                    instance = new PasswordEncrypt();
                }
            }
        }
        return instance;
    }
    
    public PasswordEncrypt(){
    }
    
    /**
     * 
     * 根据密钥加密用户的密码信息
     * @param pass 用户设置的密码
     * @return
     * @Date:2016-5-5
     * @Author wwei
     */
//    public String  encryptPass(String pass){
//        String ePass ="";
//        if(pass==null || pass.length()==0){
//            return  ePass;
//        }
//        try {
//            ePass = EncrypAES.EncrytorPass(pass);
//        } catch (Exception e) {
//            log.error("encryptPass error",e);
//        }
//        return ePass;
//    }
    
    /**
     * 把Md5的密钥进行再加密
     * @param pass  已经进行Md5加密的密钥
     * @return
     * @Date:2016-5-14
     * @author ruijia.lan
     */
//    public String encryptPassNoMd5(String pass)
//    {
//        String ePass = "";
//        if(pass==null || pass.length()==0){
//            return ePass;
//        }
//        try{
//            ePass = EncrypAES.EncrytorPassNoMD5(pass);
//        } catch (Exception e){
//            log.error("encryptPass error", e);
//        }
//        return ePass;
//    }
    
    /**
     * 
     * 检测用户的密码
     * @param pass   新输入的密码
     * @param ePass  旧的已加密的密码字符串
     * @return
     * @Date:2016-5-5
     * @Author wwei
     */
//    public boolean  checkEncryptPass(String pass,String ePass){
//       String newPass =  encryptPass(pass);
//       if(newPass.equalsIgnoreCase(ePass)){
//           return true;
//       }
//       return false;
//    }
    
    
//    public static void main(String [] args) {
//        System.out.println(PasswordEncrypt.getInstance().encryptPass("mingsi888"));
//        //System.out.println(MD5Util.encryption("mingsi888"));
//        System.out.println(PasswordEncrypt.getInstance().encryptPassNoMd5("45F9609ACCB7343E74DFD2A14E93F137"));
//        System.out.println(PasswordEncrypt.getInstance().encryptPassNoMd5("A8038DDE2F2992A7AA9C51EDABC2AB4A"));
//    }
}
