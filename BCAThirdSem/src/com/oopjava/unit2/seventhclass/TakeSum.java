package com.oopjava.unit2.seventhclass;

import java.util.Scanner;

public class TakeSum {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a numbers");
				
		int sum = 0;
				
		while(true) {
			int num = scanner.nextInt();
			
			if(num<0) {
				break;
			}
			
			sum = sum+num;
		}
		
		System.out.println("Total sum : "+sum);

		
		scanner.close();
		
		
	}

}
