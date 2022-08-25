package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class CheckPositiveNegative {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		
		if(num<0) {
			System.out.println("Entered number is negative."+num);
		}else {
			System.out.println("Entered number is positive."+num);
		}
		
		scanner.close();
	}
	

}
