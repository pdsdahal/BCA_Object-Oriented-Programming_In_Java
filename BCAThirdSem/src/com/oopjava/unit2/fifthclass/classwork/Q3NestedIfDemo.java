package com.oopjava.unit2.fifthclass.classwork;

public class Q3NestedIfDemo {

	public static void main(String[] args) {
		
		int num = -5;
		
		if(num>0) {
			if(num>3) {
				int cube = num*num*num;
				System.out.println("cube : "+cube);
			}else {
				System.out.println("Nummber is not greater than 3");
			}
		}else {
			int square = num*num;
			System.out.println("Squaure : "+square);
		}
		
	}
	
}
