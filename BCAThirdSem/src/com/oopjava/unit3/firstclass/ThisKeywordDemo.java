package com.oopjava.unit3.firstclass;

public class ThisKeywordDemo {

	private int age;
	private String address;
	private String name;
	
	public void setData(int age, String address, String name) {
		this.age = age;//use to refer current class instance variable and parameter
		this.address = address;
		this.name= name;
		
		this.showData();//used to invoke current class method
	}
	public void showData() {
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
	
	public static void main(String[] args) {	
		ThisKeywordDemo demo = new ThisKeywordDemo();
		demo.setData(11, "Bhaktapur", "Ram Panday");
		
	}
}
