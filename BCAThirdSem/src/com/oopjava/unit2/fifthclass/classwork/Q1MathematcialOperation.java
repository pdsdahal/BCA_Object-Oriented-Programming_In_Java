package com.oopjava.unit2.fifthclass.classwork;

import java.util.Scanner;

public class Q1MathematcialOperation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
	
		int mul = num1*num2;
		int sum = num1+num2;
		int sub = num1- num2;
		double div = (double)num1/(double)num2;
		
		
		System.out.println(num1 + " + "+num2 +" = "+sum);
		System.out.println(num1 + " - "+num2 +" = "+sub);
		System.out.println(num1 + " * "+num2 +" = "+mul);
		System.out.println(num1 + " / "+num2 +" = "+div);
		
		scanner.close();
	}
}
