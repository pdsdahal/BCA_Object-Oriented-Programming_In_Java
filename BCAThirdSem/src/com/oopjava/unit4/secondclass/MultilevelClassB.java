package com.oopjava.unit4.secondclass;

public class MultilevelClassB extends MultilevelClassA {
	
	public void setParentDetails(int age, String name) {
		super.setAge(age);
		super.setName(name);
	}
	
	public void showParentInfo() {
		System.out.println("Parent Details");
		System.out.println("Name : "+super.name);
		System.out.println("Age : "+super.age);
	}

}
