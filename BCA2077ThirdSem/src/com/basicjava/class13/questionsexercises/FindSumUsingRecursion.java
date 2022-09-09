package com.basicjava.class13.questionsexercises;

public class FindSumUsingRecursion {

	public int sum(int n) {	
		if(n >= 1) {
			return n+sum(n-1);
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {

		FindSumUsingRecursion demo = new FindSumUsingRecursion();
		int result = demo.sum(5);
		System.out.println("Sum is : "+result);
	}
}