package com.chuangge.authcenter.manager.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuangge.authcenter.dao.AuthUserMapper;
import com.chuangge.authcenter.exception.AuthCenterException;
import com.chuangge.authcenter.manager.AuthUserManager;
import com.chuangge.authcenter.model.domain.AuthUser;
import com.chuangge.authcenter.model.result.ResultDO;

/**
 * hoss系统登录用户manager
 *
 * @author 国楠
 * @since JDK1.7
 */
@Service
public class AuthUserManagerImpl implements AuthUserManager {


	// 用户
	@Autowired
	private AuthUserMapper authUserMapper;

	public ResultDO<AuthUser> findAuthUserByUserNameAndPassword(String userName, String password)
			throws AuthCenterException {
		ResultDO<AuthUser> result = new ResultDO<AuthUser>();
		ResultDO<AuthUser> authUserResultDO = findAuthUserByUserName(userName);
		if (!authUserResultDO.isSuccess()) {
			return authUserResultDO;
		}
		if (!authUserResultDO.getModule().getUserPass().equals(password)) {
			result.setErrMsg("用户名密码不匹配!");
			return result;
		}
		result.setModule(authUserResultDO.getModule());
		result.setSuccess(true);
		return result;
	}

	public ResultDO<AuthUser> findAuthUserByUserName(String userName) throws AuthCenterException {
		ResultDO<AuthUser> result = new ResultDO<AuthUser>();
		AuthUser authUser = authUserMapper.findAuthUserByUserName(userName);

		if (authUser == null) {
			authUser = authUserMapper.findAuthUserByEmail(userName);
		}
		if (authUser == null) {
			authUser = authUserMapper.findAuthUserByMobile(userName);
		}
		if (authUser == null) {
			result.setErrMsg("用户不存在!");
			return result;
		}
		if (StringUtils.isEmpty(authUser.getUserPass())) {
			result.setErrMsg("密码未初始化,请联系系统管理员!");
			return result;
		}
		result.setModule(authUser);
		result.setSuccess(true);
		return result;
	}

}
