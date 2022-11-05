package com.basicjava.unit5;

public class ThrowsDemo {

	public void add(int num1, int num2) throws NumberFormatException, NullPointerException {
		int sum = num1 + num2;

		if (sum % 2 == 0) {
			throw new NumberFormatException("Even Number");
		} else {
			throw new NullPointerException("Null is not allowed.");
		}
	}

	public static void main(String[] args) {
		ThrowsDemo throwsDemo = new ThrowsDemo();
		try {
			throwsDemo.add(10, 20);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
