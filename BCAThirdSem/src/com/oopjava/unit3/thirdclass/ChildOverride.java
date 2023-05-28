package com.oopjava.unit3.thirdclass;

//child extends parent
public class ChildOverride extends ParentOverride {

	public void findDiff(int num1, int num2) {
		int diff = num2 - num1;
		System.out.println("From Child : "+num2 + " - "+num1 + " = "+diff);
	}
	
	
	public static void main(String[] args) {
		
		//upcasting
		ParentOverride childOverride = new ChildOverride();
		childOverride.findDiff(14, 13);
		
		childOverride.findSum(10, 20);
		
		ParentOverride parentOverride = new ParentOverride();
		parentOverride.findDiff(14, 13);
		
	}
}
