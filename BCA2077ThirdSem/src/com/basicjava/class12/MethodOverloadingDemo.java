package com.basicjava.class12;

public class MethodOverloadingDemo {

	public void multiplication(int num1, int num2) {
		int result = num1*num2;
		System.out.println("Muliplication of "+num1+" , "+num2 + " = "+result);
	}
	
	public void multiplication(int num1, int num2, int num3) {
		int result = num1*num2*num3;
		System.out.println("Muliplication of "+num1+" , "+num2 + " , "+num3+" = "+result);
	}
	
	public void multiplication(double num1, double num2) {
		double result = num1*num2;
		System.out.println("Muliplication of "+num1+" , "+num2 + " = "+result);
	}
	
	
}
