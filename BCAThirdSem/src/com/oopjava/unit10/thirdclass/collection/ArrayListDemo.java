package com.oopjava.unit10.thirdclass.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		//add data 
		arrayList.add("Ram");
		arrayList.add("Shyam");
		arrayList.add("Gopal");
		
		//get data
		String dataAtIndexOne = arrayList.get(1);
		System.out.println("At index 1 : "+dataAtIndexOne);
		
		//remove 
		arrayList.remove(2);
		System.out.println("After removed : "+arrayList.toString());
		
		//iteratively display 
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		//clean all records
		arrayList.clear();
		
	}

}
