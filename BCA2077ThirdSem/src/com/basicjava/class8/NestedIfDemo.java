package com.basicjava.class8;

public class NestedIfDemo {

	public static void main(String[] args) {
		
		int num = 10;
		
		if(num<20) {
			if(num==15) {
				System.out.println("Number is equal to 15");
			}else {
				System.out.println("Number is not equal to 15");
			}
		}else {
			System.out.println("Num is not less than 20.");
		}
		
		
	}
}
