package com.chuangge.user.model.query;
/*
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司
 * Author:zouwei
 * Date:2014年8月7日
 * Description:AuthPermissionsQuery.java
 */
public class AuthPermissionsQuery {
	/** 用户ID */
	private Long userId;
	/** 角色ID */
	private Long roleId;
	
	/** 权限类型:1目录,2菜单,3权限 */
	private Integer type;
	/** 权限级别 */
	private Integer level;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}


