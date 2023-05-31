package com.oopjava.unit4.secondclass;

public class MultilevelClassA {
	
	protected String name;
	protected int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showClassAInfo() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	

}
