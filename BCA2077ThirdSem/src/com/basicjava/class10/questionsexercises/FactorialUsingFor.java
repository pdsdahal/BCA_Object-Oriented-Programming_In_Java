package com.basicjava.class10.questionsexercises;

import java.util.Scanner;

public class FactorialUsingFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int mulResult = 1;
		int originalNumber = n;
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				mulResult = mulResult * i;
			}
		} else if (n == 0) {
			mulResult = 1;
		}
		System.out.println("Factorial of " + originalNumber + " = " + mulResult);
		scanner.close();
	}
}