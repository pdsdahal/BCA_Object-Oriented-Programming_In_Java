package com.oopjava.unit4.thirdclass;

import java.util.Scanner;

public class BuiltInPackageDemo {

	public void getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter a number ");
		int num = scanner.nextInt();
		System.out.println("Entered number is : " + num);
		scanner.close();

	}

	public static void main(String[] args) {

		BuiltInPackageDemo demo = new BuiltInPackageDemo();
		demo.getInputFromUser();

	}
}
