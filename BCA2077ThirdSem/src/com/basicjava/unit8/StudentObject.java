package com.basicjava.unit8;

import java.io.Serializable;

public class StudentObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private String name;
	private int age;
	
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	
}
