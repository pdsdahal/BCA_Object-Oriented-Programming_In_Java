package com.oopjava.unit10.seocndclass.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCreationUsingHashSet {

	public static void main(String[] args) {
		
		Set<String> dataSet = new HashSet<>();
		dataSet.add("Ram");
		dataSet.add("Shyam");
		dataSet.add("Hari");
		
		//using iterator to display data from set
		Iterator<String> datas =  dataSet.iterator();
		while(datas.hasNext()) {
			System.out.println("Data : "+datas.next());
		}
		
		
		dataSet.remove("Shyam");
		
		System.out.println("After Remove : ");
		System.out.println(dataSet.toString());
		
		
		
	}
}
