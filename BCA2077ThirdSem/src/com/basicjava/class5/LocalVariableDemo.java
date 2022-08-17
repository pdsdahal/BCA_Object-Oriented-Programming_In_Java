package com.basicjava.class5;

public class LocalVariableDemo {
	
	public void add() {
		int num1 = 10;
		int num2= 20;
		int result = num1+num2;
		System.out.println("Sum of "+num1+" , "+num2+ " : "+result);
	}
	
	public static void main(String[] args) {
		int a = 0;
		a = a+10;
		System.out.println(a);
		LocalVariableDemo demo = new LocalVariableDemo();
		demo.add();
	}
}
