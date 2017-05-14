package com.chuangge.user.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2014/8/14.
 */
public class UserInfoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2366192993933200573L;

	private Long id;
    private String name;
    private String userName;
    private String userPass;
    private String email;
    private String mobile;
    private Integer disabled;
    private Long empId;
    private String authStr;
    private Long companyId;
    
    //homePage
    private String homePageUrl;
    
    
    public String getHomePageUrl() {
		return homePageUrl;
	}

	public void setHomePageUrl(String homePageUrl) {
		this.homePageUrl = homePageUrl;
	}

	public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAuthStr() {
        return authStr;
    }

    public void setAuthStr(String authStr) {
        this.authStr = authStr;
    }



	public Integer getDisabled() {
		return disabled;
	}


	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}


	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
		this.empId = empId;
	}


	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
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

}
