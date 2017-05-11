package com.chuangge.authcenter.model.domain;

import java.util.Date;

import javax.persistence.Column;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * AuthUser entity. @author MyEclipse Persistence Tools
 */
public class AuthUser{

    /**  */
    private Long id;
    /** 创建人 */
    private Long creater;
    /** 创建时间 */
    private Date createTime;
    /** 修改人 */
    private Long modifier;
    /** 修改时间 */
    private Date modifyTime;
    /** 版本号 */
    private Long version;
	private static final long serialVersionUID = -2313734358142215926L;
	// Fields
	@Column(name = "emp_id")
	private Long empId;
	@Column(name = "name", length = 50)
	private String name;
	@Column(name = "user_name", length = 100)
	private String userName;
	@Column(name = "user_pass", length = 100)
	private String userPass;
	@Column(name = "email", length = 100)
	private String email;
	@Column(name = "mobile", length = 20)
	private String mobile;
	@Column(name = "disabled")
	private Integer disabled;
	/**
	 *0、自然添加 1、加盟添加 2、虎虎同步
	 */
	@Column(name = "type")
	private Integer type;

	@Column(name = "companyid")
	private Long companyid;

    @Column(name = "emp_create_time")
    protected java.util.Date empCreateTime;

    @Column(name = "emp_modify_time")
    protected java.util.Date empModifyTime;

	// Constructors

	/** default constructor */
	public AuthUser() {
	}

	/** minimal constructor */
	public AuthUser(Long id) {
		this.id = id;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
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

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}


	public java.util.Date getEmpCreateTime() {
		return empCreateTime;
	}

	public void setEmpCreateTime(java.util.Date empCreateTime) {
		this.empCreateTime = empCreateTime;
	}

	public java.util.Date getEmpModifyTime() {
		return empModifyTime;
	}

	public void setEmpModifyTime(java.util.Date empModifyTime) {
		this.empModifyTime = empModifyTime;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreater() {
		return creater;
	}

	public void setCreater(Long creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifier() {
		return modifier;
	}

	public void setModifier(Long modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
}