package cn.songlin.common.dto;

import java.io.Serializable;
import java.util.Date;

public class LocalUser implements Serializable {

	private static final long serialVersionUID = -8868821553907742920L;

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * SSO的USER表id
	 */
	private String userId;

	private String name;

	private String mobilePhone;

	private String password;

	private String photoUrl;

	private String nickName;

	/**
	 * 创建时间
	 */
	private Date createDate;

	/**
	 * 更新时间
	 */
	private Date updateDate;

	/**
	 * 用户类型：1：普通用户 2：媒体用户 3：官方用户
	 */
	private Byte userType;

	private String email;

	private String qq;

	/**
	 * 注册时间
	 */
	private Date registerDate;

	/**
	 * 最后登录时间
	 */
	private Date lastLoginDate;

	/**
	 * 性别(1: 男 2 女)
	 */
	private Integer sex;
	/**
	 * 地址
	 */
	private String address;

	/**
	 * token
	 */
	private String token;
	/**
	 * token有效期
	 */
	private long tokenExpireTime;
	/**
	 * 当前系统时间
	 */
	private long systemTime;

	/**
	 * 获取主键id
	 *
	 * @return id - 主键id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置主键id
	 *
	 * @param id 主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取SSO的USER表id
	 *
	 * @return user_id - SSO的USER表id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 设置SSO的USER表id
	 *
	 * @param userId SSO的USER表id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return mobile_phone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @param mobilePhone
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return photo_url
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * @param photoUrl
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * @return nick_name
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 获取创建时间
	 *
	 * @return create_date - 创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createDate 创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取更新时间
	 *
	 * @return update_date - 更新时间
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * 设置更新时间
	 *
	 * @param updateDate 更新时间
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 获取用户类型：1：普通用户 2：媒体用户 3：官方用户
	 *
	 * @return user_type - 用户类型：1：普通用户 2：媒体用户 3：官方用户
	 */
	public Byte getUserType() {
		return userType;
	}

	/**
	 * 设置用户类型：1：普通用户 2：媒体用户 3：官方用户
	 *
	 * @param userType 用户类型：1：普通用户 2：媒体用户 3：官方用户
	 */
	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return qq
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * 获取注册时间
	 *
	 * @return register_date - 注册时间
	 */
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * 设置注册时间
	 *
	 * @param registerDate 注册时间
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	/**
	 * 获取最后登录时间
	 *
	 * @return last_login_date - 最后登录时间
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * 设置最后登录时间
	 *
	 * @param lastLoginDate 最后登录时间
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * 获取性别(1: 男 2 女)
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * 获取性别(1: 男 2 女)
	 * 
	 * @param sex
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 获取地址
	 *
	 * @return address - 地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置地址
	 *
	 * @param address 地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getTokenExpireTime() {
		return tokenExpireTime;
	}

	public void setTokenExpireTime(long tokenExpireTime) {
		this.tokenExpireTime = tokenExpireTime;
	}

	public long getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(long systemTime) {
		this.systemTime = systemTime;
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", userId=" + userId + ", name=" + name + ", mobilePhone=" + mobilePhone
				+ ", password=" + password + ", photoUrl=" + photoUrl + ", nickName=" + nickName + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", userType=" + userType + ", email=" + email + ", qq="
				+ qq + ", registerDate=" + registerDate + ", lastLoginDate=" + lastLoginDate + ", sex=" + sex
				+ ", address=" + address + "]";
	}

}