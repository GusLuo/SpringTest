package com.cn.spring.one;

public class SpringOne {

	private String msg;

	private String name;
	
	private String sex;
	
	private String email;
	
	public SpringOne(String sex,String name) {

		this.sex = sex;
		this.name=name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	
	
}
