package com.basicjava.class6;

public class WideningTypeCastingDemo {

	public static void main(String[] args) {
		int num1 = 345;
		
		System.out.println("Initial Data  : "+num1);
		
		double num2 = num1;
		System.out.println("Final Result after type casting : "+num2);
	
		long num3 = num1;
		System.out.println("Final Result after casting : "+num3);
		
	}
}
