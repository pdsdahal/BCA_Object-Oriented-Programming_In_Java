package com.basicjava.class1;

public class ErrorTypes {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		int num3 = num1+num2 ;
		System.out.println("the sum of "+num1 + " , "+num2 + " is "+num3);
		
		try {
			int num4  = 10;
			int num5 = 0;
			int result1 = num4/num5;
			
			System.out.println("Division of "+num4+" , "+num5 + " = "+result1);
		}catch(Exception e) {
			System.out.println("Message : "+e.getMessage());
		}
	}
}
