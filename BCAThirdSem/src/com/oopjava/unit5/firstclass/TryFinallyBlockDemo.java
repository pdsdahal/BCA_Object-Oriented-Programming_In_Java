package com.oopjava.unit5.firstclass;

import java.util.Scanner;

public class TryFinallyBlockDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to throw excetion : ");
		
		int num = 0;
		try {
			num = scanner.nextInt();
		}finally {
			System.out.println("inside the finally block");
		}
		
		System.out.println("Entered data is  : "+num);
		scanner.close();
	}
}
