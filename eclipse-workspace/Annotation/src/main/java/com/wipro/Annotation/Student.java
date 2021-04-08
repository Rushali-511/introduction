package com.wipro.Annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {

	
	private String name;
	private String age;
	
	
	public String getName() {
		return name;
	}
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	
	@Autowired (required = false)
	public void setAge(String age) {
		this.age = age;
	}

}
