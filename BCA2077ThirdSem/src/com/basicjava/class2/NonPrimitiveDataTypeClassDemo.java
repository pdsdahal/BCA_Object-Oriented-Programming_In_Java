package com.basicjava.class2;

public class NonPrimitiveDataTypeClassDemo {

	private int studentId;
	private String studentName;
	private String address;
	private boolean gender;
	private long phoneNo;
	private double percentage;
	
	public NonPrimitiveDataTypeClassDemo(int studentId, String studentName, String address, boolean gender, long phoneNo, double percentage){
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.percentage = percentage;
	}
	
	public void getStudentInfo() {
		
		System.out.println("Id : "+studentId);
		System.out.println("Name : "+studentName);
		System.out.println("Address : "+address);
		System.out.println("Gender : "+gender);
		System.out.println("PhoneNo : "+phoneNo);
		System.out.println("Percentage : "+percentage);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
}
