package com.oopjava.unit3.thirdclass;

public class MethodOverloadingDemo {

	public void setEmployeeDetails() {
		System.out.println("First Method without Paraeter");
	}
	
	
	
	public void setEmployeeDetails(String employeeName) {
		System.out.println("Second Method : "+employeeName);
	}

	public void setEmployeeDetails(String employeeName, int age) {
		System.out.println("Third Method : "+employeeName + " Age : "+age);
	}

	public void setEmployeeDetails(String employeeName, double age) {
		System.out.println("Fourth Method : "+employeeName + " Age : "+age);
	}

	
	public static void main(String[] args) {
	
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.setEmployeeDetails("Ram Panday", 12);
		demo.setEmployeeDetails("Shyam Dahal", 12.3);
		demo.setEmployeeDetails();
		demo.setEmployeeDetails("Hari Panday");
		
	}
}
