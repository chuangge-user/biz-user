package com.chuangge.authcenter.exception;

/*
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司
 * Author:   邹伟
 * Date:     2014.08.06
 * Description: 权限模块异常类
 * History: 变更记录
 *
 */
public class AuthCenterException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1878378134846961936L;

	public AuthCenterException() {
    }

    public AuthCenterException(String message) {
        super(message);
    }

    public AuthCenterException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthCenterException(Throwable cause) {
        super(cause);
    }

    public AuthCenterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
