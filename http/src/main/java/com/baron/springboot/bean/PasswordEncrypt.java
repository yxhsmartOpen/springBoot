package com.baron.springboot.bean;

import lombok.extern.slf4j.Slf4j;


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
