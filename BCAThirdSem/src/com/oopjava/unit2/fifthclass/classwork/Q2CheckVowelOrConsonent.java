package com.oopjava.unit2.fifthclass.classwork;

import java.util.Scanner;

public class Q2CheckVowelOrConsonent {

	public static void main(String[] args) {
		
		System.out.println("Eneter a character");
		Scanner scanner = new Scanner(System.in);
		
		char data = scanner.nextLine().toLowerCase().charAt(0);
		
		if(data == 'a' || data=='e' || data=='i' || data=='o' || data=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonent");
		}
		scanner.close();
	}
}
