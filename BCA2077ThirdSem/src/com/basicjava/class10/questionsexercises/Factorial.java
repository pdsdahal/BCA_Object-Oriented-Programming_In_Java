package com.basicjava.class10.questionsexercises;

import java.util.Scanner;
/*
 * Q. 
 * Write a Java Program to find the factorial of any number.
 */
public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int mulResult = 1;

		int originalNumber = n;

		if (n > 0) {
			while (n > 0) {
				mulResult = mulResult * n;
				n--;
			}
		} else if (n == 0) {
			mulResult = 1;
		}
		System.out.println("Factorial of " + originalNumber + " = " + mulResult);		
		scanner.close();
	}
}