package com.oopjava.unit10.firstclass;

public class Q7Ass4 {

	private String name;
	private String address;
	private int age;
	private String phoneNo;
	
	public Q7Ass4(String name, String address, int age, String phoneNo) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString() {
		return "Name "+name + "\nAddress : "+address+"\nAge : "+age+"\nPhoneNo : "+phoneNo;
	}
	
	public static void main(String[] args) {
		
		Q7Ass4 parent = new Q7Ass4("Baba", "Baba ghar", 40, "234567");
		
		System.out.println("Parent Info : "+parent);
		
		Q7Ass4 own = new Q7Ass4("Choro", "Choro ghar", 20, "2345676");
		System.out.println("Own : "+own);
		
		Q7Ass4 friend=  new Q7Ass4("Sathi", "Sathi ghar", 20, "2345679");
		System.out.println("Friend : "+friend);
	}
	
	
}
