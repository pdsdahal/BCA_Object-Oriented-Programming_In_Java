package com.basicjava.class9.questionsexercises;

import java.util.Scanner;

public class OddEvenSumCountForLoop {

	public static void main(String[] args) {

		int oddSum = 0;
		int evenSum = 0;
		int oddCount = 0;
		int evenCount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n term");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				evenCount = evenCount + 1;
				evenSum = evenSum + i;
			} else {
				oddCount = oddCount + 1;
				oddSum = oddSum + i;
			}
		}
		System.out.println("Odd Count : " + oddCount);
		System.out.println("Odd Sum : " + oddSum);
		System.out.println("Even Count : " + evenCount);
		System.out.println("Even Sum : " + evenSum);
		scanner.close();
	}
}