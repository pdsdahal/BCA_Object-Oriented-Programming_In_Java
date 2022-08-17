package com.basicjava.class5;

public class InstanceVariableDemo {

	private int studentId;
	private String studentName;
	private boolean gender;
	public String address;
	
	public void setValues() {
		studentId  =10;
		studentName = "Ram Panday";
		gender = true;
		address = "Bhaktapur 31";
	}
	public void displayStudentInfo() {
		System.out.println("Id : "+studentId);
		System.out.println("Name : "+studentName);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
	}
	
	public static void main(String[] args) {
	
		InstanceVariableDemo demo = new InstanceVariableDemo();
		demo.setValues();
		demo.displayStudentInfo();
		
	}
}
