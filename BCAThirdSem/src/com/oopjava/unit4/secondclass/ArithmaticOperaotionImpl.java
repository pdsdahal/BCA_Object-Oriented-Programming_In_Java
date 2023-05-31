package com.oopjava.unit4.secondclass;

public class ArithmaticOperaotionImpl implements ArithmaticOperaotion {

	public void sum(int num1, int num2) {
	
		int result = num1+num2;
		System.out.println("The sum of "+num1+ " + "+num2 + " = "+result);
	}

	public int diff(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public void showDetails() {
		System.out.println("Texas College");
	}

	public static void main(String[] args) {
		
		ArithmaticOperaotionImpl obj = new ArithmaticOperaotionImpl();
		int result = obj.diff(10, 5);
		System.out.println("Diff is : "+result);
		
		obj.sum(10, 400);
		obj.showDetails();
	}
	
}
