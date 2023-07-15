package com.oopjava.unit10.forthclass.accesscollection;

import java.util.Comparator;

public class DepartmentSortingUsingComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		//return o1.compareTo(o2);//asc
		return o2.compareTo(o1);//desc
		
	}
}