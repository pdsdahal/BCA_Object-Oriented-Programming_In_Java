package com.basicjava.class7;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 10;
		
		int result1 = num1&num2;
		System.out.println("Using & : "+result1);
		
		int result2 = num1|num2;
		System.out.println("Using | : "+result2);
	}
}
