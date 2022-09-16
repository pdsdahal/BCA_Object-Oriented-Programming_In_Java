package com.basicjava.class15;

import java.util.Scanner;

public class BuiltInPackageDemo {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a string");
		String data = scanner.nextLine();
		String dataUpper = data.toUpperCase();
		System.out.println("Input : "+data);
		System.out.println("Output : "+dataUpper);
		scanner.close();
	}
}
