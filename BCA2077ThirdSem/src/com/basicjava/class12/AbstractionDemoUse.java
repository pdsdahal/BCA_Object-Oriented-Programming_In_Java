package com.basicjava.class12;

public class AbstractionDemoUse extends AbstractionDemo {

	public void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum of "+num1 + " , "+num2 + " = "+sum);
	}

	public int mul(int num1, int num2) {
		return num1*num2;
	}
	
	public static void main(String[] args) {
		AbstractionDemoUse demoUse = new AbstractionDemoUse();
		demoUse.add(10, 30);
		
		int result = demoUse.mul(10, 20);
		System.out.println("Muliplication of 10 and 20 is : "+result);
	}
}
