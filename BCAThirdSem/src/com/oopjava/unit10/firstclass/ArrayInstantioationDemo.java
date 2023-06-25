package com.oopjava.unit10.firstclass;

import java.util.Arrays;

public class ArrayInstantioationDemo {
	
	public static void main(String[] args) {
		
		//array instantiation 
		int[] rollNos = new int[3];
		
		String[] names = new String[3];
		
		//add element inside the array
		rollNos[0] = 10;
		rollNos[1] = 2;
		rollNos[2] = 100;
		
		
		names[0] = "Ram";
		names[1] = "Shayam";
		names[2] = "Hari";
		
		//array sorting
		
		for(int i=0;i<names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if((names[i].compareTo(names[j])) > 0) {
					String data = names[i];
					names[i] = names[j];
					names[j] = data;
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
		
	}

}
