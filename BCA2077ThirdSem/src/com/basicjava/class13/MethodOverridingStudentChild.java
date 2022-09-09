package com.basicjava.class13;

public class MethodOverridingStudentChild extends MethodOverridingPersonParent {

	private int age = 10;
	private String phoneNo = "123456789";
	
	public void displayInfo() {
		System.out.println("From Child Class");
		System.out.println("Age : "+age);
		System.out.println("Phone No : "+phoneNo);
	}
	
	public static void main(String[] args) {
		
		//call from child
		MethodOverridingStudentChild student = new MethodOverridingStudentChild();
		student.displayInfo();
		
		//call from parent 
		MethodOverridingPersonParent person = new MethodOverridingPersonParent();
		person.displayInfo();
		
		//upcasting 
		MethodOverridingPersonParent upcasting = new MethodOverridingStudentChild();
		upcasting.displayInfo();
		
	}
}
