/**
 * 
 */
package com.light.springboot.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author leihuating
 * @time 2018年4月4日 下午12:17:18
 */
public class User {

	private Integer id;

	private String username;

	private String password;

	@JSONField(format = "yyyy-MM-dd")
	private Date birthday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
