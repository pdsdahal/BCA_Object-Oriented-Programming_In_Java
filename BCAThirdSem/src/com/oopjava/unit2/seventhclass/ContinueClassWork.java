package com.oopjava.unit2.seventhclass;

import java.util.Scanner;

public class ContinueClassWork {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a n terms : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		System.out.println("Enter a numbers ");
		for(int i=0;i<n;i++) {
			
			int num = scanner.nextInt();
			if(num<0) {
				continue;
			}
			sum = sum+num;
		}
		
		System.out.println("total sum : "+sum);
		scanner.close();
	}

}
