package com.chuangge.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chuangge.user.util.AppConfigConstants;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/**
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司 Author:zouwei Date:2014年8月12日
 * SmsSendServiceImpl
 */
@Service
public class SmsSendServiceImpl implements SmsSendService {
	
	private static Logger logger = LoggerFactory.getLogger(SmsSendServiceImpl.class);

	@Override
	public String sendSms(String mobile, String smsParam) {
		String returnStr = "";
		try {
			TaobaoClient client = new DefaultTaobaoClient(AppConfigConstants.SMS_SERVER_URL, AppConfigConstants.SMS_APP_KEY, AppConfigConstants.SMS_APP_SECRET);
			AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
			req.setSmsType(AppConfigConstants.SMS_TYPE);
			req.setSmsFreeSignName(AppConfigConstants.SMS_FREE_SIGN_NAME);
			req.setSmsParamString(smsParam);
			req.setRecNum(mobile);
			req.setSmsTemplateCode(AppConfigConstants.SMS_TEMPLATE_CODE_1);
			AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
			returnStr = rsp.getBody();
		} catch (ApiException e) {
			e.printStackTrace();
		} finally {
			return returnStr;
		}
	}
	
}
