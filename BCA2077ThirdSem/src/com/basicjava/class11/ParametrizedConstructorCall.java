package com.basicjava.class11;

public class ParametrizedConstructorCall {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		ParametrizedConstructor demo = new ParametrizedConstructor(num1,num2);
		demo.addition();
		int result = demo.getResult();
		System.out.println("Addition of "+num1  + " , "+num2 + " = "+result);
	}
}
