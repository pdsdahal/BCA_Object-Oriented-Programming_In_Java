package com.basicjava.unit5;

public class NestedTryBlockDemo {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 5;

			try {
				int c = (a + b) / 0;
				System.out.println("Result is : " + c);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
