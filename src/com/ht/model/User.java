package com.ht.model;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public User(Integer id, String name, Integer age, String sex, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.createTime = createTime;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", createTime=" + createTime
				+ "]";
	}
	

}
