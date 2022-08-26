package com.basicjava.class9.questionsexercises;

import java.util.Scanner;

public class MultiplicationWhile {

	public static void main(String[] args) {

		int i = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		while (i <= 10) {
			int mul = n * i;
			System.out.println(n + " * " + i + " = " + mul);
			i++;
		}
		scanner.close();
	}
}