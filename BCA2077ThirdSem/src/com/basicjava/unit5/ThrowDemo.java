package com.basicjava.unit5;

public class ThrowDemo {

	public void findMax(int num1, int num2) {
		if (num1 < num2) {
			throw new ArithmeticException("Num1 is less than num2");
		}
	}

	public static void main(String[] args) {

		ThrowDemo demo = new ThrowDemo();
		try {
			demo.findMax(10, 20);
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
		}
	}
}
