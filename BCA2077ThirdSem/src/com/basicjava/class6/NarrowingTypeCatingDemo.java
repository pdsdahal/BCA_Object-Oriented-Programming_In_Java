package com.basicjava.class6;

public class NarrowingTypeCatingDemo {

	public static void main(String[] args) {
		
		double num1 = 1234567.45678;
		System.out.println("Initial value : "+num1);
		int num2 = (int) num1;
		System.out.println("Result after type casting : "+num2);
		
	
		long num3 = 1234567894545l;
		System.out.println("Initial Data : "+num3);
		int num4 = (int) num3;
		System.out.println("After casting result : "+num4);
		
		
	}
}
