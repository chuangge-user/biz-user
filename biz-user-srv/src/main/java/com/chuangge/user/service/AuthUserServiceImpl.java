package com.chuangge.user.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuangge.user.exception.AuthCenterException;
import com.chuangge.user.manager.AuthUserManager;
import com.chuangge.user.model.domain.AuthUser;
import com.chuangge.user.model.dto.UserInfoDTO;
import com.chuangge.user.model.result.ResultDO;

/**
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司 Author:zouwei Date:2014年8月12日
 * Description:AuthUserServiceImpl.java
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {
	
	private static Logger logger = LoggerFactory.getLogger(AuthUserServiceImpl.class);


    @Autowired
	private AuthUserManager authUserManager;

	/**
	 * 用户登陆
	 *
	 * @param userName
	 *            登陆用户名
	 * @param password
	 *            登陆密码
	 * @return UserInfoDTO
	 * @throws AuthCenterException
	 */
	public ResultDO<UserInfoDTO> userLogin(String userName, String password)
			throws AuthCenterException {
		logger.info("loing userName " + userName + "password" + password);
		
        ResultDO<UserInfoDTO> result = new ResultDO<UserInfoDTO>();
        result.setSuccess(false);
		if (StringUtils.isEmpty(userName)) {
            result.setErrMsg("用户名为空!");
            return result;
		}
        if(StringUtils.isEmpty(password)){
            result.setErrMsg("密码为空!");
            return result;
        }
        userName = userName.trim();
		ResultDO<AuthUser> authUserResult = findAuthUserByUserNameAndPassword(userName,
				password);
		if (!authUserResult.isSuccess()) {
            result.setErrMsg(authUserResult.getErrMsg());
            return result;
		}
        if(authUserResult.getModule()==null){
            result.setErrMsg("对不起,账号不存在!");
            return result;
        }
        if(authUserResult.getModule().getDisabled()==null ){
            result.setErrMsg("对不起,你的账号已被禁用!");
            return result;
        }
        
        AuthUser atu = authUserResult.getModule();
        UserInfoDTO user = new UserInfoDTO();
        user.setUserName(atu.getUserName());
        user.setCompanyId(atu.getCompanyid());
        result.setSuccess(authUserResult.isSuccess());
        result.setModule(user);
        return result;
	}

	public ResultDO<AuthUser> findAuthUserByUserNameAndPassword(String userName,
			String password) throws AuthCenterException {

		return authUserManager.findAuthUserByUserNameAndPassword(userName,
                password);
	}
	
}
