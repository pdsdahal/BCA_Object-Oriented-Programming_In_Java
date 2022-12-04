package com.basicjava.unit9;

public class MathClassDemo {

	public static void main(String[] args) {
		
		int num1 = -10004;
		int resultNum1 = Math.abs(num1);
		System.out.println("Result of num1 : "+resultNum1);
		
		
		double num2 = 4.5;
		System.out.println("Rounding of num2 : "+Math.round(num2));
		
		double num3 = 4.4;
		System.out.println("Rounding of num3 : "+Math.round(num3));
		
		double num4 = 4.1;
		System.out.println("Ceil of num4 : "+Math.ceil(num4));
		
		double num5 = 4.5;
		System.out.println("Floor of num5 : "+Math.floor(num5));
		
		System.out.println("Sine 30 : "+Math.sin(Math.toRadians(30.0)));
		
	}
}
