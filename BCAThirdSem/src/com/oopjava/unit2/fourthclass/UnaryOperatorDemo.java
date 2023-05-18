package com.oopjava.unit2.fourthclass;

public class UnaryOperatorDemo {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		
		System.out.println("Initial Number : "+num1);
		num1++;// num1 = num1+1 = 10+1=11
		num1++;//num1 = num1+1 = 11+1=12
		System.out.println("Final Number  (++) : "+num1);
		
		
		num1--;//num1= num1-1 = 12-1=11
		System.out.println("Using (--) : "+num1);
		
		
		int num  = 100;
		num = -num;// num = -100
		System.out.println("Using (-) : "+num);
		
		num = -num;// - (-100) = +100
		System.out.println("Using (-) : "+num);
		
	}

}
