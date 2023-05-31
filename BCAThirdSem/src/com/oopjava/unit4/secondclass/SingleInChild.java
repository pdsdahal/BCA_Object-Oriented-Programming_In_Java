package com.oopjava.unit4.secondclass;

public class SingleInChild extends SingleInParent {

	private int num1;
	private int num2;
	
	public SingleInChild(int num1, int num2) {
		super(num1, num2);
		this.num1  = num1;
		this.num2 = num2;
	}
	
	public void calculateSub() {
		int sub = num1 - num2;
		System.out.println("Subtraction of "+num1 + " - "+num2 + " = "+sub);
	}
	
	public static void main(String[] args) {
		
		SingleInChild child = new SingleInChild(10, 12);
		child.calculateAdd();
		child.calculateSub();
	}
}
