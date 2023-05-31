package com.oopjava.unit3.fourthclass;

public class FactorialRecussion {
	
	public int getFact(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * getFact(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		FactorialRecussion demo = new FactorialRecussion();
		int result = demo.getFact(5);
		System.out.println("Factorial of 5 is : "+result);
		
	}
}
