package com.chuangge.user.service;

import com.chuangge.user.exception.AuthCenterException;

/**
 * Copyright (C), 2012-2014, 上海创格服饰有限公司
 * @author jinchunyu
 * Date:2017年5月17日
 * @since   JDK1.8
 */
public interface SmsSendService {

   /**
    * 发送短信
    * @param mobile
    * @param smsParam
    * @return
    * @throws AuthCenterException
    */
    String sendSms(String mobile,String smsParam);
}

