package com.chuangge.authcenter.manager;

import com.chuangge.authcenter.exception.AuthCenterException;
import com.chuangge.authcenter.model.domain.AuthUser;
import com.chuangge.authcenter.model.result.ResultDO;

/**
 * hoss系统登录用户manager
 * 
 * @author 邹伟
 * @since JDK1.7
 */
public interface AuthUserManager {

	

	/**
	 * 通过用户名密查找用户
	 * 
	 * @param userName
	 *            用户登陆名(登录名、邮箱、手机)
	 * @param password
	 *            登陆密码 AuthUser
	 */
	ResultDO<AuthUser> findAuthUserByUserNameAndPassword(String userName, String password)
			throws AuthCenterException;


}
