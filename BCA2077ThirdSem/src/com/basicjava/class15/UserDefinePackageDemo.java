package com.basicjava.class15;

import com.basicjava.class14.*;


public class UserDefinePackageDemo implements EmployeeInterface {

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

		UserDefinePackageDemo demo = new UserDefinePackageDemo();
		demo.setEmployeeInfo("Ram Dahal", "Kathmandu 1");
		demo.showEmployeeInfo();
		
		EmployeeInterfaceImpl demo2 = new EmployeeInterfaceImpl();
		
	}
}
