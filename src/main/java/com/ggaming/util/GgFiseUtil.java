package com.ggaming.util;


import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GgFiseUtil {

	//public static String md5 = ProperUtil.readValue("gg_md5");
	//public static String des = ProperUtil.readValue("gg_des");
	//public static String cagentId = ProperUtil.readValue("gg_cagent");
	/**
    *
    * @param plainText
    *            明文
    * @return 32位密文
    */
   public static String encryption(String plainText) {
       String re_md5 = new String();
       try {
           MessageDigest md = MessageDigest.getInstance("MD5");
           md.update(plainText.getBytes());
           byte b[] = md.digest();

           int i;

           StringBuffer buf = new StringBuffer("");
           for (int offset = 0; offset < b.length; offset++) {
               i = b[offset];
               if (i < 0)
                   i += 256;
               if (i < 16)
                   buf.append("0");
               buf.append(Integer.toHexString(i));
           }

           re_md5 = buf.toString();

       } catch (NoSuchAlgorithmException e) {
           System.out.println(" msg : "+e);
       }
       return re_md5;
   }
   
	 //MD5后的密文
    public static String getMd5_(String passWord,String md5){
       return encryption(passWord+md5);
    }

    //获取密文
    public static String getPassWord(String value,String des){
        try {
            PHPDESEncrypt d = new PHPDESEncrypt(des);
            String p=d.encrypt(value);
            System.out.println("密文:"+p+"");
            return p;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
	//通过固定的请求获取放回信息
	 public static String toPost(String sUrl,String cagentId) {
	        URL url=null;
	        HttpURLConnection httpConn=null;
	        InputStream in=null;
	        try{
	           // url=new URL("http://apisw2.gg626.com/api/doSingle.do?params=pgHgqAgQMuNrSCSxbDjdbJN2Wo7xjLz/VxXwW06usyjxqsdhiS2+SaM1yR+/KIdPO7doVoJws4EhK8uGREpNpB4+fjivU9Cvs/n8es8eIjE=&key=4cadd7c29f2e66ebca95c38e848e4330");
	            url=new URL(sUrl);
	            httpConn=(HttpURLConnection) url.openConnection();
	            HttpURLConnection.setFollowRedirects(true);
	            httpConn.setConnectTimeout(30000);
	            httpConn.setReadTimeout(30000);
	            httpConn.setRequestMethod("GET");
	            httpConn.setRequestProperty("GGaming","WEB_GG_GI_"+cagentId);
	            in=httpConn.getInputStream();
	            String odds=new String(StreamTool.readInputStream(in),"UTF-8");
	            return odds;
	        }catch (Exception e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                httpConn.disconnect();
	            }catch (Exception ex){
	                ex.printStackTrace();
	            }

	        }
	        return "";
	    }
}
