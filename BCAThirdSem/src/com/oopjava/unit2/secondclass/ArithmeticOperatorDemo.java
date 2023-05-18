package com.oopjava.unit2.secondclass;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		
		int sum = num1 + num2;
		double div = (double) num1/ (double)num2;
		int mod =  num1 %  num2;
		int sub = num1 - num2;
		int mul = num1*num2;
		
		System.out.println(num1+" + "+num2+ " = "+sum);
		System.out.println(num1+" / "+num2+ " = "+div);
		System.out.println(num1+" % "+num2+ " = "+mod);
		System.out.println(num1+" - "+num2+ " = "+sub);
		System.out.println(num1+" * "+num2+ " = "+mul);
		
		
		
	}
}
