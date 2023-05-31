package com.oopjava.unit4.firstclass;

public class ParentSuper {

	protected String firstName;
	protected String lastName;
	protected int age;

	public ParentSuper(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showParentInfo() {
		System.out.println("From Parent");
		System.out.println("FirstName : " + firstName);
		System.out.println("LastName : " + lastName);
		System.out.println("Age : " + age);
	}

}
