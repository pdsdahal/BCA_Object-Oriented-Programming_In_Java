package com.oopjava.unit2.sixthclass.classwork;

import java.util.Scanner;

public class TakeInputCharaUsingSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a single character");

		char data = scanner.nextLine().toLowerCase().charAt(0);

		switch (data) {

		case 's':
			System.out.println("Sunday");
			break;

		case 'm':
			System.out.println("Monday");
			break;

		default:
			System.out.println("No case match...");

		}

		scanner.close();

	}

}
