package com.oopjava.unit6.firstclass;

public class StringComparision {
	
	public static void main(String[] args) {
		
		//1. way : using equals, equalsIgnoreCase methods
		String name1 = "Ram Panday";
		String name2 = "ram Panday";
		
		boolean result1 = name1.equals(name2);
		System.out.println(name1+" (equals) "+name2 + " = "+result1);
		
		
		boolean result2 = name1.equalsIgnoreCase(name2);
		System.out.println(name1+" (equalsIgnoreCase) "+name2 + " = "+result2);
	
		
		if(result1) {
			System.out.println("Both are euals");
		}else {
			System.out.println("Not equal");
		}
		
		//2. way : using == 
		
		String collegeName1 = "Texas College";
		String collegeName2 = "ABC College";
		
		boolean rCollegeName = collegeName1 == collegeName2;
		System.out.println(collegeName1+" (==) "+collegeName2 + " = "+rCollegeName);
		
		//3. way : using compareTo
		
		String name_1 = "Shankar";//7
		String name_2 = "Shankar Dahal";//5
		
		int compareTo = name_1.compareTo(name_2);
		System.out.println(name_1+" (compareTo) "+name_2 + " = "+compareTo);
		
		
		
	}

}
