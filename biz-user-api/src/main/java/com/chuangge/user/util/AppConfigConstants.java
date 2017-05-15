package com.chuangge.user.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Common Description:静态变量列表
 * 
 * @Project : maxtp
 * @ClassName : Common
 * @Author : jinchunyu
 * @CreateDate : 2014-4-8 下午3:12:23
 */
public class AppConfigConstants {

	static final Log log = LogFactory.getLog(AppConfigConstants.class);

	// 系统配置文件
	public static Properties APP_CONFIG = new Properties();
	static {
		init();
	}
	
	private static void init() {
		try {
//			InputStream inStream = AppConfigConstants.class.getClassLoader().getResourceAsStream("config/appConfig.properties");
//			APP_CONFIG.load(inStream);
			APP_CONFIG.load(new InputStreamReader(AppConfigConstants.class.getClassLoader().getResourceAsStream("config/appConfig.properties"), "UTF-8"));  
		} catch (IOException e1) {
			log.error("读取配置文件失败:appConfig.properties", e1);
		}
	}
	
	//发送短信地址
	public static final String SMS_SERVER_URL = (String) APP_CONFIG.get("smsServerUrl");
	
	//发送短信appKey
	public static final String SMS_APP_KEY = (String) APP_CONFIG.get("smsAppKey");
	
	//发送短信appSecret
	public static final String SMS_APP_SECRET = (String) APP_CONFIG.get("smsAppSecret");
	
	//发送短信类型
	public static final String SMS_TYPE = (String) APP_CONFIG.get("smsType");
	
	//发送短信签名
	public static final String SMS_FREE_SIGN_NAME = (String) APP_CONFIG.get("smsFreeSignName");
	
	//发送短信模版1
	public static final String SMS_TEMPLATE_CODE_1 = (String) APP_CONFIG.get("smsTemplateCode1");
}
