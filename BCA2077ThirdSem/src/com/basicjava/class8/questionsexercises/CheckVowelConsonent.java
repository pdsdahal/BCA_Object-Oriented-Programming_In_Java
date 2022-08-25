package com.basicjava.class8.questionsexercises;

import java.util.Scanner;

public class CheckVowelConsonent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character ");
		char data = scanner.nextLine().toLowerCase().charAt(0);
		
		if(data=='a' || data == 'e' || data=='i' || data == 'o' || data=='u') {
			
			if(data=='a') {
				System.out.println("A is vowel.");
			}else if(data=='e') {
				System.out.println("B is vowel.");
			}
			else if(data=='i') {
				System.out.println("I is vowel.");
			}
			
			else if(data=='o') {
				System.out.println("O is vowel.");
			}
			else {
				System.out.println("U is vowel.");
			}
		}else {
			System.out.println("Entered character is consonent.");
		}
		
		scanner.close();
	}
	
}
