package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class CheckShapes {
	
	public static void main(String[] args) {
		
		int l,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter l and b");
		l = scanner.nextInt();
		b = scanner.nextInt();
		
		if(l==b) {
			System.out.println("This is square.");
			int area = l*l;
			System.out.println("Area of square is : "+area);
			
		}else {
			System.out.println("This is rectangle.");
			int area = l*b;
			System.out.println("Area of rectangle is :"+area);
		}
		scanner.close();
		
	}

}
