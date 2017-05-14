package com.chuangge.user.dao;

import org.springframework.stereotype.Repository;

import com.chuangge.user.model.domain.AuthUser;

/**
 * Copyright (C), 2012-2015, 上海好屋网信息技术有限公司
 * Author:   黄双双
 * Date:     2016/1/7
 * Description: 获取区域信息
 * <author>           <time>             <version>        <desc>
 * 黄双双           2016/1/7              00000001        创建文件
 */
@Repository
public interface AuthUserMapper {

	/**
	 * 通过用户登陆名查询用户信息
	 * 
	 * @param userName
	 *            用户名
	 * @return
	 */
	public AuthUser findAuthUserByUserName(String userName);
	

	/**
	 * 通过邮箱查询用户信息
	 * 
	 * @param email
	 *            邮箱
	 * @return
	 */
	public AuthUser findAuthUserByEmail(String email);

	/**
	 * 通过手机查询用户信息
	 * 
	 * @param mobile
	 *            手机号码
	 * @return
	 */
	public AuthUser findAuthUserByMobile(String mobile) ;
}
