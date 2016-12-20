package com.swu.grouppad.system.user.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.swu.grouppad.common.BaseEntity;

@Entity
@Table(name = "user")
/**
 * 用户
 * @author lixer
 */
public class User extends BaseEntity {

	// 账号
	@Column(name = "username", unique = true, nullable = false)
	private String username;
	// 密码
	@Column(name = "password", nullable = false)
	private String password;
	// 用户姓名
	@Column(name = "name", nullable = false)
	private String name;

	// 用户角色集合

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
