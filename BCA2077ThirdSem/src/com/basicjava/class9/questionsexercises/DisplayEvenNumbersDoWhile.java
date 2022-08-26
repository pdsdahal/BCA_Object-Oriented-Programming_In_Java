package com.basicjava.class9.questionsexercises;

import java.util.Scanner;

public class DisplayEvenNumbersDoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter nth term : ");
		int n = scanner.nextInt();
		int firstNumber = 2;
		do {
			System.out.println("Even Number : " + firstNumber);
			firstNumber = firstNumber + 2;

		} while (firstNumber < n);
		scanner.close();
	}
}