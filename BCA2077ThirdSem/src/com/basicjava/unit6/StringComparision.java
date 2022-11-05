package com.basicjava.unit6;

public class StringComparision {

	public static void main(String[] args) {
	
		//using equals
		
		String data1 = "Texas";
		String data2 = "Texas GGGG";
		
		boolean result1 = data1.equals(data2);
		System.out.println("Result 1 : "+result1);
		
		boolean result2 = data1.equalsIgnoreCase(data2);
		System.out.println("Result 2 : "+result2);
		
		//using == 
		if(data1==data2) {
			System.out.println("Both are equal.");
		}else {
			System.out.println("Not equal.");
		}
		
		//using compareTo 
		int result  = data1.compareTo(data2);
		System.out.println("Result : "+result);
		
	}
}
