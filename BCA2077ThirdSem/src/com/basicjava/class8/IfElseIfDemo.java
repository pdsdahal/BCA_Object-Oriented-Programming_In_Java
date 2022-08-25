package com.basicjava.class8;

public class IfElseIfDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		if(a==11) {
			System.out.println("Number is equal to 11.");
		}
		
		else if(a>20) {
			System.out.println("Number is greater than 20.");
		}
		
		else if(a<11) {
			System.out.println("Number is less than 11.");
		}
		
		else {
			System.out.println("Condition not matched."+a);
		}
	}
}
