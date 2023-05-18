package com.oopjava.unit2.thirdclass;

public class LogicalOperatorDemo {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result2 = num1>num2 && num1<num2;
		boolean result3 = num1>num2 || num1<num2;
		
		System.out.println("Using &&  "+result2);
		System.out.println("Using || "+result3);
		
	}

}
