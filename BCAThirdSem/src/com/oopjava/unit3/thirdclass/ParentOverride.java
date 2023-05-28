package com.oopjava.unit3.thirdclass;

public class ParentOverride {

	public void findDiff(int num1, int num2) {
		int diff = num1 - num2;
		System.out.println("From Parent : "+num1 + " - "+num2 + " = "+diff);
	}
	
	public void findSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("From Parent : "+num1 + " + "+num2 + " = "+sum);
	}
	
}
