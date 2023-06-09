package com.oopjava.unit6.firstclass;

public class StirngModification {
	
	public static void main(String[] args) {
		String collegeName = "TexasZInternationalZCollege";
		
		System.out.println("Initial String : "+collegeName);
		String result1 = collegeName.replaceAll("Z", " ");
		System.out.println("Using (replaceAll) : "+result1);
		
		
		String address = "Kathamndu Nepal";
		System.out.println("Initial String : "+address);
		
		String subStringOFAddress = address.substring(0, 5);
		System.out.println("Using (substring) : "+subStringOFAddress);
		
		
		String[] address1  = address.split(" ");
		String firstData = address1[0];
		System.out.println("First Index : "+firstData);
		
		String secondData = address1[1];
		System.out.println("Second Index : "+secondData);
		
		
		String personName = "Ram Ram Dahal";
		String result = personName.replaceFirst("Ram", "Shyam");
		System.out.println("Using (replaceFirst) : "+result);
		
		
			
	}	
}
