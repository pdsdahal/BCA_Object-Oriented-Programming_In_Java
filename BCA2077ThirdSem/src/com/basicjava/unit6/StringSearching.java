package com.basicjava.unit6;

public class StringSearching {
	
	public static void main(String[] args) {
	
		String data = "Texas International International College";
		
		int index = data.indexOf("International");
		System.out.println("Index of International is : "+index);
		
		int lastIndex = data.lastIndexOf("International");
		System.out.println("Index of International from last : "+lastIndex);	
	}
}