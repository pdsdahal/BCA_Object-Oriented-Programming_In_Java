package com.basicjava.class13;

public class MethodOverridingPersonParent {

	private String name = "Sita Panday";
	private String address = "Bhaktapur 1";

	public void displayInfo() {
		System.out.println("From Parent Class");
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
