package com.basicjava.class9.questionsexercises;

import java.util.Scanner;

public class SumOfOddumberDoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n term : ");
		int n = scanner.nextInt();
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i = i + 2;
		} while (i < n);
		System.out.println("Sum of odd number is  : " + sum);
		scanner.close();
	}
}