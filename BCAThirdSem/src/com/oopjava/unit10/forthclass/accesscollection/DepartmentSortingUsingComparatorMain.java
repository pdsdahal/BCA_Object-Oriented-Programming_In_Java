package com.oopjava.unit10.forthclass.accesscollection;

import java.util.ArrayList;
import java.util.Collections;

public class DepartmentSortingUsingComparatorMain {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Ram");
		nameList.add("Hari");
		nameList.add("Shyam");
		nameList.add("Sita");
		nameList.add("Apple");
		
		Collections.sort(nameList, new DepartmentSortingUsingComparator());
		
		System.out.println("After Sorting : "+nameList.toString());
		
	}
}
