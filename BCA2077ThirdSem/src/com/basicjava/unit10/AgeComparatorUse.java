package com.basicjava.unit10;

import java.util.ArrayList;
import java.util.Collections;

public class AgeComparatorUse {

	public static void main(String[] args) {
		
		ArrayList<Integer> age = new ArrayList<>();
		age.add(12);
		age.add(6);
		age.add(11);
		age.add(13);
		age.add(188);
		age.add(23);
		
		System.out.println("Before sort : "+age);
		Collections.sort(age, new AgeComparator());
		
		System.out.println("After sorting : "+age);
		
	}
}
