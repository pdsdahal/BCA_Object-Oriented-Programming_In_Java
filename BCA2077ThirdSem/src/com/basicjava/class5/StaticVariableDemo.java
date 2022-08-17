package com.basicjava.class5;

public class StaticVariableDemo {

	public static String name;
	
	public static void displayName(String studentName) {
		name = studentName;
	}
	
	public static void main(String[] args) {
		
		StaticVariableDemo.displayName("Rudhra Panday");
		System.out.println("Name is : "+StaticVariableDemo.name);
		
	}
	
}
