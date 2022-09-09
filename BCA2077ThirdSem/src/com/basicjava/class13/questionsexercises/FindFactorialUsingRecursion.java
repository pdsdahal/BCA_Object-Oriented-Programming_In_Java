package com.basicjava.class13.questionsexercises;

public class FindFactorialUsingRecursion {

	public int factorial(int n) {
		
		if(n >= 1) {
			return n*factorial(n-1);
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {

		FindFactorialUsingRecursion demo = new FindFactorialUsingRecursion();
		int result = demo.factorial(5);
		System.out.println("Factorial is : "+result);
	}
}