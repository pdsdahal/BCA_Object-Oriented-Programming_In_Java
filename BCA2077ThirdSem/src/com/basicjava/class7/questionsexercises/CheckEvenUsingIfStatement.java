package com.basicjava.class7.questionsexercises;

import java.util.Scanner;

public class CheckEvenUsingIfStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println("Entered number is even. "+num);
		}
		scanner.close();
	}
}
