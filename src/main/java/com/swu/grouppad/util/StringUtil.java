package com.swu.grouppad.util;

public class StringUtil {

	/**
	 * 字符串是否有效（不为null且不为空）
	 * 
	 * @param inputStr
	 * @return
	 */
	public static boolean isValid(String inputStr) {
		if (inputStr != null && inputStr != "") {
			return true;
		} else {
			return false;
		}
	}

}
