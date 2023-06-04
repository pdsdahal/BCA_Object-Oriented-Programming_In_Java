package com.oopjava.unit5.firstclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyBlockDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to throw excetion : ");
		
		int num = 0;
		try {
			num = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Reason : "+e.getMessage());
		}
		finally {
			System.out.println("inside the finally block");
			scanner.close();
		}
		
		System.out.println("Entered data is  : "+num);
		
	}
}
