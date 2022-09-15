package com.basicjava.class14;

public class EmployeeInterfaceImpl implements EmployeeInterface {

	private String name;
	private String address;
	
	public void showEmployeeInfo() {
		
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}

	public void setEmployeeInfo(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		EmployeeInterfaceImpl demo = new EmployeeInterfaceImpl();
		demo.setEmployeeInfo("Shyam Padnay", "Bhaktapur 1");
		demo.showEmployeeInfo();
	}
	
}
