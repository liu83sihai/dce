/**
 * Project Name:jcpt-encrypt <br>
 * File Name:KeyUtil.java <br>
 * Package Name:com.hehenian.encrypt.util <br>
 * Copyright (c) 2017, 深圳市彩付宝网络技术有限公司 All Rights Reserved.
 */

package com.yisi.business.util;

import org.apache.commons.lang3.StringUtils;


/**
 * ClassName: KeyUtil <br>
 * Description: 获取加密的key
 * @version
 * @since JDK 1.6
 */
public class KeyUtil {

    /**
     * 
     * getKey:获取加密秘钥. <br>
     *
     * @return
     * @throws Exception
     */
    public static String getKey() throws Exception {
        String encryptKey = KeyUtil.getAesKey();
        if (encryptKey == null || "".equals(encryptKey.trim())) {
            throw new Exception("获取AES.KEY为空");
        }
 
        return encryptKey;
    }

	public static String DEFAULT_ENCODE = "UTF-8";
	public static int RSA_KEY_LENGTH = 1024;
	public static int AES_KEY_LENGTH = 128;
	public static String AES_KEY = "963123E172844AA9DFAF3F099159BBFA48EE8D6C7268E7F4336D676FE9AA6E22BCE296351FCC9CB69502A4D75FBD7984";
	public static String HHYD_AES_SALT="$#@Sfdf43232/.xnyZio3$324l234JFDWW1!FFqwe";
	
	
	/** 
	 * 从配置文件读取获取aes加密长度
	 * @return  
	 */
	public static int  getAesEncryptLength() {
	    
	    return AES_KEY_LENGTH;
	}
	/** 
	 * 从配置文件读取获取aes key
	 * @return  
	 */
	public static String getAesKey() {
	    return AES_KEY;
	}
	/** 
	 * 从配置文件读取获取aes salt
	 * @return  
	 */
	public static String getAesSalt() {
	    return HHYD_AES_SALT;
	}
}
