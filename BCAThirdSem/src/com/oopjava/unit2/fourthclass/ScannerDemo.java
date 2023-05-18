package com.oopjava.unit2.fourthclass;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your salary");
		double salary  = scanner.nextDouble();
		
		System.out.println("Enter your gender");
		boolean gender = scanner.nextBoolean();
		
		scanner.nextLine();
		System.out.println("Enter a single character");
		char character = scanner.nextLine().charAt(0);
		
		System.out.println("Your information : ");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);
		System.out.println("Character : "+character);
		
		scanner.close();
		
	}

}
