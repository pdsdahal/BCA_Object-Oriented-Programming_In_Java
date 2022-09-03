package com.basicjava.class11;

public class NoArgumentConstructor {
	
	private long employeeId;
	private String employeeAddress;
	private String employeeContactNo; 
	
	public NoArgumentConstructor() {
		employeeId = 1l;
		employeeAddress = "Baneshowr";
		employeeContactNo = "234567890";
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Id : "+employeeId);
		System.out.println("Address : "+employeeAddress);
		System.out.println("Contact No. : "+employeeContactNo);
	}

}
