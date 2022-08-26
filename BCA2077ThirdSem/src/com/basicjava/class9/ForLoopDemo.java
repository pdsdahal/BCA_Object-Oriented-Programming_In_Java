package com.basicjava.class9;

public class ForLoopDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 200; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of natural numbers : " + sum);
	}
}