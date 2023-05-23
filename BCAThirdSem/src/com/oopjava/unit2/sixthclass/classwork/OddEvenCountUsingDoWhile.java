package com.oopjava.unit2.sixthclass.classwork;

public class OddEvenCountUsingDoWhile {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		int oddCount = 0;
		int eventCount = 0;
		
		do {
		
			if(i%2==0) {
				eventCount = eventCount + 1;
			}else {
				oddCount = oddCount  + 1;
			}
			
			i++;
		}while(i<=100);


		System.out.println("Total number of odd from 1 to 100 : "+oddCount);
		System.out.println("Total number of even from 1 to 100 : "+eventCount);
		
		
	}

}
