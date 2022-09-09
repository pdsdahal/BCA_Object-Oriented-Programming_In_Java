package com.basicjava.class13;

public class PassByValueDemo {
	
	public void add(int num1, int num2) {
		num1 = 5;
		int result = num1+num2;
		System.out.println("sum of "+num1 + " , "+num2 + " = "+result);
	}
	
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		
		PassByValueDemo byValueDemo = new PassByValueDemo();
		byValueDemo.add(num1, num2);
		System.out.println("Value of Num1 after calling add method : "+num1);
	}
}