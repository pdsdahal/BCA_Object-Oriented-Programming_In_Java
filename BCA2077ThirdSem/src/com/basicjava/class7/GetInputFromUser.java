package com.basicjava.class7;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		//Get int data
		System.out.println("Enter a first number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter a second number : ");
		int num2 = scanner.nextInt();
		
		int additionResult = num1+num2;
		int subtractionResult = num1-num2;
		int multiplicationResult = num1*num2;
		double divisonResult = (double)num1/(double)num2;
		double modeResult = (double)num1%(double)num2;
		
		System.out.println("Add : "+additionResult);
		System.out.println("Sub : "+subtractionResult);
		System.out.println("Mul : "+multiplicationResult);
		System.out.println("Div : "+divisonResult);
		System.out.println("Rem : "+modeResult);
		
		//Get String data
		
		scanner.nextLine();
		
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		System.out.println("Entered name is : "+name);
		
		scanner.close();
		
	}
}
