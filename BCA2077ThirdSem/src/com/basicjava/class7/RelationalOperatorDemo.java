package com.basicjava.class7;

import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your monthly expenses");
		double exp = scanner.nextDouble();
		
		//==
		if(exp==100.12) {
			System.out.println("your expenses is equals to my expected : "+exp);
		}else {
			System.out.println("your expenses is not equals to my expected : "+exp);
		}
		//>
		
		if(exp < 100.12) {
			System.out.println("your expenses greater than my expected : "+exp);
		}else {
			System.out.println("your expenses less than my expected : "+exp);
		}
		
	}
}
