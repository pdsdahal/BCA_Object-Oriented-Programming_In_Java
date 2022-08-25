package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class MathmaticalOperatonUsingSwitch {

	public static void main(String[] args) {

		int num1, num2;

		System.out.println("Eneter a two numbers ");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");

		System.out.println("Enter which operation do you want to perform:");
		int num = scanner.nextInt();

		switch (num) {

		case 1:
			int add = num1 + num2;
			System.out.println("Sum of " + num1 + " , " + num2 + " = " + add);
			break;

		case 2:
			int sub = num1 - num2;
			System.out.println("substraction of " + num1 + " , " + num2 + " = " + sub);
			break;
			
		case 3:
			int div = num1 / num2;
			System.out.println("Division of " + num1 + " , " + num2 + " = " + div);
			break;

		case 4:
			int mul = num1 * num2;
			System.out.println("Multiplication of " + num1 + " , " + num2 + " = " + mul);
			break;

			
		}
		
		scanner.close();
	}
}
