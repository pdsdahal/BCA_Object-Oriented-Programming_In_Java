package com.basicjava.class7;

import java.util.Scanner;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		int sum=10;
		sum += num;
		System.out.println("Add and Assignmnet oprator : "+sum);
		
		int sub = 30;
		sub -= num;
		System.out.println("Substract and Assignmnet operator : "+sub);
		
		scanner.close();
				
		
	}
}
