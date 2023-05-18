package com.oopjava.unit2.thirdclass;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		
		//simple assignment operator 
		int num1 = 10;
		String collegeName = "Texas International College";
		
		System.out.println("Using (=) : "+num1);
		//add and assignment operator 
		int num2 = 20;
		int num3  = 30;
		num3 += num2;// num3 = num3+num2
		System.out.println("Using (+=) : "+num3);
		
		//subtract and assignment operator 
		
		int num4 = 50;
		int num5 = 60;
		num5 -= num4; // num5 = num5-num4
		System.out.println("Using (-=) : "+num5);
		
		
		
		
	}
	
}
