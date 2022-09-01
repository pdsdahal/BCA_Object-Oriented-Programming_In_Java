package com.basicjava.class10.questionsexercises;

import java.util.Scanner;

/*
 * Q. 
 * Write a java program to calculate the sum of number if user input 
 * the negative number, it should not include in the result. 
 */
public class TakeInputSumContinue {

	public static void main(String[] args) {

		System.out.println("Enter nth term");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println("Enter a number");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int num = scanner.nextInt();
			if (num < 0) {
				continue;
			} else {
				sum = sum + num;
			}
		}

		System.out.println("Sum of positive number is : " + sum);
		scanner.close();
	}

}
