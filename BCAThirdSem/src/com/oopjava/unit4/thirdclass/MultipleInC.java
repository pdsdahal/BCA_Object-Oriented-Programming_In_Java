package com.oopjava.unit4.thirdclass;

public class MultipleInC implements MultipleInA, MultipleInB {

	public void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(num1 + " + "+num2 + " = "+sum);
	}
	
	public void diff(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println(num1 + " - "+num2 + " = "+sub);
	}
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		MultipleInC childC = new MultipleInC();
		childC.add(num1, num2);
		childC.diff(num1, num2);
	}
	
}
