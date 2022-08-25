package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class PercentageSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double cprogramming, math, english,physics;
		double obtainedTotalMarks = 0;
		double total = 400;
		double percentage;
		
		
		System.out.println("Enter your c programming score");
		cprogramming = scanner.nextDouble();
		
		System.out.println("Enter your Math score");
		math = scanner.nextDouble();
		
		System.out.println("Enter your English score");
		english = scanner.nextDouble();
		
		System.out.println("Enter your Physics programming score");
		physics = scanner.nextDouble();
		
		obtainedTotalMarks = cprogramming + math + english+physics;
		percentage = (obtainedTotalMarks/total)*100;
		
		if(percentage>=80) {
			System.out.println("Distinction");
		}else if(percentage>=60 && percentage<80) {
			System.out.println("First Division");
		}else if(percentage>=50 && percentage<60) {
			System.out.println("Second Division");
		}else if(percentage>=40 && percentage<50) {
			System.out.println("Third Division");
		}else {
			System.out.println("Failed");
		}
		
		scanner.close();
	}
}
