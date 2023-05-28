package com.oopjava.unit3.secondclass;

public class ParameterziedConstructorDemo {
	
	public ParameterziedConstructorDemo(String name, int age, String address) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
	
	public int getSum(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public static void main(String[] args) {
		ParameterziedConstructorDemo demo = new ParameterziedConstructorDemo("Ram Panday", 11, "Kathamndu Nepal");
		
		int result = demo.getSum(10, 20);
		System.out.println("Sum is : "+result);
		
	}
	
	
	
	

}
