package com.basicjava.class7;

import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a two numbers ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		//logical and operator
		if(num1<10 && num2<30) {
			System.out.println("Inside if using logical and operator.");
		}else {
			System.out.println("Inside else using logical and operator");
		}
		
		//logical or operator
		
		if(num1<20 || num2< 5) {
			System.out.println("Inside if using logical or operator");
		}else {
			System.out.println("Inside else using logical or operator");
		}
		
		
		//logical not
		
		if(!(num1 < 10)) {
			System.out.println("Inside if statement");
		}else {
			System.out.println("Inside else statement");
		}
		
		scanner.close();
	}
}
