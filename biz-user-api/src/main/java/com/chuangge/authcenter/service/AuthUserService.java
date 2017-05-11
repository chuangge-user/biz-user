package com.chuangge.authcenter.service;

import com.chuangge.authcenter.exception.AuthCenterException;
import com.chuangge.authcenter.model.dto.UserInfoDTO;
import com.chuangge.authcenter.model.result.ResultDO;

/**
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司
 * hoss系统用户service
 * @author 国楠
 * Date:2014年8月8日
 * @since   JDK1.7
 */
public interface AuthUserService {

    /**
     * 用户登陆
     * @param userName 登陆用户名
     * @param password 登陆密码
     * @return ResultDO<UserInfoDTO> 用户信息
     */
    ResultDO<UserInfoDTO> userLogin(String userName,String password) throws AuthCenterException;
   
}

