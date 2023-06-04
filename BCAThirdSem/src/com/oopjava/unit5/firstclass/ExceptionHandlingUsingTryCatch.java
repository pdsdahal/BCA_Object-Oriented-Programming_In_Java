package com.oopjava.unit5.firstclass;

public class ExceptionHandlingUsingTryCatch {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;

		int div = 0;
		try {
			 div = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Exception : "+e.getMessage());
		}
		System.out.println("Div : " + div);

	}

}
