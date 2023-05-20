package com.oopjava.unit2.fifthclass;

public class NestedIfDemo {

	public static void main(String[] args) {
		if(true) {
			if(false) {
				
			}else if(true) {
				
				System.out.println("Inside the else if");
			}else {
				System.out.println("Inside the else");
			}
		}else {
			System.out.println("Inside the outer else");
		}
		
	}
}
