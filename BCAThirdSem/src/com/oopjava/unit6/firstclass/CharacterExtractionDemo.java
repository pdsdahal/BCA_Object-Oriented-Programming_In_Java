package com.oopjava.unit6.firstclass;

public class CharacterExtractionDemo {
	
	public static void main(String[] args) {
		
		String collegeName = "Texas international College";
		
		//1- way : using charAt(indexNo)
		for(int i=0;i<collegeName.length();i++) {
			char charAtZero = collegeName.charAt(i);
			System.out.println("At "+i+" index : "+charAtZero);
		}
		
		System.out.println("\n\n");
		
		//2- way: using toCharArray method
		String address = "Bhaktapur";
		char[] charAddress = address.toCharArray();
		for(int i=0;i<charAddress.length;i++) {
			System.out.println("At : "+i+" index : "+charAddress[i]);
		}
		
	}

}
