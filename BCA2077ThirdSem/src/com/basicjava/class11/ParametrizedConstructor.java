package com.basicjava.class11;

public class ParametrizedConstructor {

	private int num1; 
	private int num2;
	private int result;
	
	public ParametrizedConstructor(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void addition() {
		 result = num1  / num2;
	}
	
	public int getResult() {
		return result;
	}
	
}
