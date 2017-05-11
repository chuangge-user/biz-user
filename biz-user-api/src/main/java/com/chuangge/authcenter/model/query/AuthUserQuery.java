package com.chuangge.authcenter.model.query;

import java.io.Serializable;
import java.util.List;

/**
 * 用户Query对象
 * @author 邹伟
 *
 */
public class AuthUserQuery implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6158273345683624643L;
	
	/** ID集合 */
	private List<Long> ids;
	
	/** 用户名 */
	private String name;
	/** 登陆名 */
	private String userName;
	
	/** 邮箱 */
	private String email;
	
	/** 手机号码 */
	private String mobile;
	
	/** 部门ID */
	private Long departId;
	
	/** 员工号 */
	private Long empId;

    /** 查询关键字 */

    private String queryKey;

    private Integer disabled;

	private Integer type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public Long getDepartId() {
		return departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
	}

	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}


