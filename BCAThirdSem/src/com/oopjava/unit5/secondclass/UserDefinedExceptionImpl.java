package com.oopjava.unit5.secondclass;

public class UserDefinedExceptionImpl {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		try {

			if (sum < 31) {
				throw new UserDefinedException("Sum is less than 20");
			}
		} catch (UserDefinedException e) {
			System.out.println("Reason : " + e.getMessage());
		}

	}
}
