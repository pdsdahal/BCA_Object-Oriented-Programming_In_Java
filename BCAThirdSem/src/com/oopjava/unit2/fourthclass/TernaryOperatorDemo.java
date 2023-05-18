package com.oopjava.unit2.fourthclass;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 10;
		
		String result = (num1>num2)? num1+" is greater" : num2+" is greater than "+num1;//20>10? true : false
		
		System.out.println("Result : "+result);
	}
}
