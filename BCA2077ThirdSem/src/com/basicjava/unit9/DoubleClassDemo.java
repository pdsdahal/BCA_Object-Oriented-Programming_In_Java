package com.basicjava.unit9;

public class DoubleClassDemo {

	public static void main(String[] args) {
		
		double num1 = 1276.5678;
		double num2 = 234567.678;
		
		//num1<num2 = result will be in negative
		int result = Double.compare(num1, num2);
		System.out.println(result);
		
	}
}
