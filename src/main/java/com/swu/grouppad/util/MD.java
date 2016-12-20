package com.swu.grouppad.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * MD(Message Digest algorithm ，信息摘要算法)
 * 通常我们不直接使用上述MD加密。通常将MD产生的字节数组交给BASE再加密一把，得到相应的字符串
 * 
 * @author lixer
 */
public class MD {
	public static String digest(String inputStr) {
		try {
			// 生成一个MD5加密计算摘要
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 计算md5函数
			md.update(inputStr.getBytes());
			// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1, md.digest()).toString(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inputStr;
	}
}
