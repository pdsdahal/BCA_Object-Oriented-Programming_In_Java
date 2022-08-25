package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your percentage.");
		double per = scanner.nextDouble();

		if (per >= 80) {
			System.out.println("Grade A");
		} else if (per >= 60 && per < 80) {
			System.out.println("Grade B");
		} else if (per >= 40 && per < 60) {
			System.out.println("Grade C");
		} else if (per >= 32 && per < 40) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade F");
		}
		scanner.close();
	}
}
