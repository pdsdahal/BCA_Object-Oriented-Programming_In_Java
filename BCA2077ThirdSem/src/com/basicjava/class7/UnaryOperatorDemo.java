package com.basicjava.class7;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		int num1 = 10;
		
		System.out.println("Before increment : "+num1);
		num1++;
		System.out.println("After increment : "+num1);
		
		num1--;
		System.out.println("After decrement : "+num1);
		
		int num2 = -num1;
		System.out.println("Uniary minus : "+num2);
	}
}
