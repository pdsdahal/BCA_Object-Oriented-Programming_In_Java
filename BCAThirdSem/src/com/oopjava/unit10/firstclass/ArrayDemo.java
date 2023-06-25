package com.oopjava.unit10.firstclass;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//array declaration 
		//way-1 : Used by all
		int[] rollno = {1,5,7,9,4};
		
		//way-2
		int [] rollno1 = {1,5,7,9,3};
		
		//way-3
		int rollno2[] = {5,7,8,9};
		
		//way-4
		int rollno3 [] = {5,7,8,9};

		//way-5 
		int[] roll4 = new int[] {8,9,10,100};
		
		//String array
		String[] names = {"Ram", "Sita","Gita"};
		
		//character of array
		char[] gender = {'M', 'F','O'};
		
		//double array
		double[] income = {1234.67, 5678, 5678.0};
		
		
		//array display 
		//way-1 : using for each loop
		for(int data : rollno) {
			System.out.println("Data : "+data);
		}
		
		//way-2 : using for loop
		System.out.println("\n\n\n");
		
		for(int i=0;i<rollno.length;i++) {
			System.out.println("Index : "+i+" , "+rollno[i]);
		}
		
		//way-3 : using do while loop
		System.out.println("\n\n\n");
		int counterFlag = 0;
		do {
			System.out.println("Index : "+counterFlag+" , "+rollno[counterFlag]);
			counterFlag++;
		}while(counterFlag<rollno.length);
		
		
	}

}
