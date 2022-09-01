package com.basicjava.class10.questionsexercises;

import java.util.Scanner;
/*
 * Q.
 * Write a Java Program to Check Whether a input Number is Prime or Not.
 */
public class PrimeNumberCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		boolean result = checkPrime(n);
		if (result) {
			System.out.println(" " + n + " is a prime number.");
		} else {
			System.out.println(" " + n + " is not a prime number.");
		}
		scanner.close();
	}

	public static boolean checkPrime(int n) {
		if (n <= 0) {
			return false;
		} else {
			int num = n / 2;
			for (int i = 2; i <= num; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}

		return true;
	}
}
