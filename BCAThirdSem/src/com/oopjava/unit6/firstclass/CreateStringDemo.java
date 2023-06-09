package com.oopjava.unit6.firstclass;

public class CreateStringDemo {
	
	public static void main(String[] args) {
		
		//immutable String 
		String data = "Ram";
		data.concat(" Dahal");
		System.out.println("Immutable Data : "+data);
		
		//mutable String 
		String name = "Ram";
		String fullName = name.concat(" Dahal");
		System.out.println("Mutable Name : "+fullName);
		
		
		//ways to create String 
		
		//1. way - By using String literal 
		
		String address = "Kathmandu Nepal";
		System.out.println("By using Stirng iteral : "+address);
		
		//2. way - By using new keyword
		
		String emailAddress = new String("apple@gmail.com");
		System.out.println("By using new keywoord: "+emailAddress);
		
		
	}
}
