package com.basicjava.unit10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		
		Set<String> studentSets = new HashSet<>();
		studentSets.add("Ram Panday");
		studentSets.add("Shyam Shrestha");
		
		System.out.println("Size : "+studentSets.size());

		//Iterator
		Iterator<String> sList =  studentSets.iterator();
		while(sList.hasNext()) {
			System.out.println(sList.next());
		}
	
	}
}
