package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day of week");
		int n = scanner.nextInt();
		
		switch(n) {
		
		case 1: 
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not supported.");
		}
		
		scanner.close();	
	}
}
