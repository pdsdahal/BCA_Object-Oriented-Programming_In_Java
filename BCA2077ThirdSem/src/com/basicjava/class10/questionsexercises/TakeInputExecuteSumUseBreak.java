package com.basicjava.class10.questionsexercises;

import java.util.Scanner;

/*
 * Q. 
 * Write a Java program calculate the sum of numbers if user 
 * input the negative numbers, then terminate the loop.
 */

public class TakeInputExecuteSumUseBreak {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int sum = 0;
		while (true) {
			int n = scanner.nextInt();

			if (n >= 0) {
				sum = sum + n;
			} else {
				break;
			}
		}

		System.out.println("Sum of positive numbers is : " + sum);
		scanner.close();
	}
}
