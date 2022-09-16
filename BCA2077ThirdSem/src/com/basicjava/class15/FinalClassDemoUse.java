package com.basicjava.class15;

public class FinalClassDemoUse{

	public static void main(String[] args) {
		FinalClassDemo demo = new FinalClassDemo(10, 20);
		int num1 = demo.getNum1();
		int num2 = demo.getNum2();
		
		System.out.println("Before Swapping : ");
		System.out.println("Num1 is : "+num1);
		System.out.println("Num2 is : "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping : ");
		System.out.println("Num1 is : "+num1);
		System.out.println("Num2 is : "+num2);
		
	}
}
