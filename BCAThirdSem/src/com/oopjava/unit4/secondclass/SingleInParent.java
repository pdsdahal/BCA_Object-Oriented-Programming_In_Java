package com.oopjava.unit4.secondclass;

public class SingleInParent {

	private int num1;
	private int num2;

	public SingleInParent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void calculateAdd() {
		int sum = num1 + num2;
		System.out.println("the sum of "+num1 + " + "+num2 + " = "+sum);
	}

}
