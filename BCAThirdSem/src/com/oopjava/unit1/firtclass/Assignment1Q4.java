package com.oopjava.unit1.firtclass;

public class Assignment1Q4 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println("Result : " + result);

		} catch (Exception e) {
			
			System.out.println("Message : "+e.getMessage());

		}

	}

}
