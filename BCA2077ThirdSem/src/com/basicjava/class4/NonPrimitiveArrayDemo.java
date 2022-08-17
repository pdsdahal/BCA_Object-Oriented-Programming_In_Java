package com.basicjava.class4;

public class NonPrimitiveArrayDemo {

	public static void main(String[] args) {
		
		int[] data1 = {1,2,3,4,5,6};
		String[] data2 = {"Apple","Ball","Cat"};
		
		//Display int array
		for(int i=0;i<data1.length;i++) {
			
			System.out.println("From index : "+i+ " , "+data1[i]);
		}
		System.out.println("\n\n\n");
		//Display String array
		for(int i=0;i<data2.length;i++) {
			System.out.println("From index : "+i+" , "+data2[i]);
		}
		
	}
	
}
