package com.oopjava.unit2.sixthclass.classwork;

public class MultiplicationTableUsingDoWhile {
	
	public static void main(String[] args) {
		
		int num = 9;
		
		int countFlag = 1;
		do {
			int mul  = num*countFlag;
			System.out.println(num+" * "+countFlag +" = "+mul);
			countFlag++;
			
		}while(countFlag<=10);
		
	}

}
