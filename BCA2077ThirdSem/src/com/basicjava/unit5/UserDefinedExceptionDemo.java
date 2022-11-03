package com.basicjava.unit5;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {

		int age = 19;

		try {
			if (age < 18) {

				throw new AgeRestriction("You are not eligible.");
			}else {
				System.out.println("You are eligible.");
			}
		} catch (AgeRestriction ex) {
			System.out.println(ex.getMessage());
		}
	}
}
