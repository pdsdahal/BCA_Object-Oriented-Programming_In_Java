package com.oopjava.unit2.secondclass;

public class JavaAccessModifiersDemo {
	
	//private access modifiers
	private int age = 11;
	//public access modifiers
	public String name = "Ram Panday";
	//protected access modifiers
	protected String phoneNo = "1234568";
	//default access modifiers
	String email = "abc@gmail.com";
	
	public static void main(String[] args) {
		
		JavaAccessModifiersDemo demo = new JavaAccessModifiersDemo();
		System.out.println("Age : "+demo.age);
		
	}

}
