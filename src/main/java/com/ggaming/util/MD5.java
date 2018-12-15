package com.ggaming.util;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
 

    /**
	 * 将摘要信息转换为相应的编码
	 * @param code 编码类型
	 * @param message 摘要信息
	 * @return 相应的编码字符串
	 */
	private static String Encode(String code,String message){
		MessageDigest md;
		String encode = null;
		try {
			md = MessageDigest.getInstance(code);
			byte[] hash = md.digest(message.getBytes("UTF-8"));
			encode = Hex.encodeHexString(hash);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encode;
	}
	
	/**
	 * 将摘要信息转换成SHA-256编码
	 * @param message 摘要信息
	 * @return SHA-256编码之后的字符串
	 */
	public static String sha256Encode(String message){
		return Encode("SHA-256",message);
	}

 
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
            e.printStackTrace();
        }
        return re_md5;
    }
}
