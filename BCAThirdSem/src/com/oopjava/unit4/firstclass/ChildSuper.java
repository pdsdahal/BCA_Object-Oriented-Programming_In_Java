package com.oopjava.unit4.firstclass;

public class ChildSuper extends ParentSuper {

	public ChildSuper(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	public void showChildInfo() {
		super.firstName = "Ram";
		super.lastName = "Dahal";
		super.age = 13;
		System.out.println("From Child: ");
		System.out.println("FirstName : "+super.getFirstName());
		System.out.println("LastName : "+super.getLastName());
		System.out.println("Age : "+super.getAge());
	}
	
	public static void main(String[] args) {
		ChildSuper child = new ChildSuper("Shyam", "Dahal",40);
		child.showParentInfo();
		
		child.showChildInfo();
		
		
	}

}
