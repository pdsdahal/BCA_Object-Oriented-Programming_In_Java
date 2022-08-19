package com.basicjava.class7.questionsexercises;

import java.util.Scanner;

public class CheckUserNameIsAdmin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String username = scanner.nextLine();
		
		if(username.equals("Admin")) {
			System.out.println("Username equals to "+username);
		}
		scanner.close();
	}
	
}
