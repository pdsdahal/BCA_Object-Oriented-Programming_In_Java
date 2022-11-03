package com.basicjava.unit5;

public class MultiCatchDemo {

	public static void main(String[] args) {

		//before jdk 7.0
		int a = 10;

		try {
			int b = a / 0;
			String data = null;
			int length = data.length();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		

		//After jdk 7.0
		int c = 10;

		try {
			int b = c / 0;
			String data = null;
			int length = data.length();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		}


	}
}
