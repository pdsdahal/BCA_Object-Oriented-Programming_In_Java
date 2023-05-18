package com.oopjava.unit2.secondclass;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		//widening type casting 
		int num1 = 10;
		double intoDouble = num1;
		
		System.out.println("********************* Widening ");
		System.out.println("Initial Number : "+num1);
		System.out.println("Final Number : "+intoDouble);
		
		//narrowing type casting 
		
		double data1 = 5678.567890;
		int doubleToInt = (int) data1;
		System.out.println("********************* Narrowing ");
		System.out.println("Initial Data : "+data1);
		System.out.println("Final Result : "+doubleToInt);
		
	}
}
