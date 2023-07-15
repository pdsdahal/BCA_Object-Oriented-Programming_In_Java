package com.oopjava.unit10.forthclass.accesscollection;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> ageList = new ArrayList<>();
		ageList.add(13);
		ageList.add(14);
		ageList.add(15);
		ageList.add(16);
		
		Iterator<Integer> ageListIter = ageList.iterator();
		while(ageListIter.hasNext()) {
			System.out.println("Element : "+ageListIter.next());
		}
		
		
	}


}
