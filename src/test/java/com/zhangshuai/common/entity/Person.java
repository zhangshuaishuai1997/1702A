package com.zhangshuai.common.entity;

import java.util.Date;

/**
 * 
 * @ClassName: Person 
 * @Description: 实体类方法
 * @author: 张帅帅
 * @date: 2019年6月17日 上午9:51:11
 */
public class Person {
	//ID
	private Integer id;
	//姓名
	private String name;
	//年龄
	private int age;
	//介绍
	private String content;
	
	private Date date;
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", content=" + content + ", date=" + date + "]";
	}

	public Person(String name, int age, String content, Date date2) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
		this.date = date2;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
