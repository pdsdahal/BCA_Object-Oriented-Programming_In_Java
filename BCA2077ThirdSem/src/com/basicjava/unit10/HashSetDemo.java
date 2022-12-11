package com.basicjava.unit10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> studentSet = new HashSet<>();
		studentSet.add("Ram Panday");
		studentSet.add("Hari Shrestha");
		studentSet.add("Gopal Shrestha");
		
		System.out.println("Initial : "+studentSet);
		
		
		Iterator<String> sList =  studentSet.iterator();
		 while(sList.hasNext()) {
			 System.out.println(sList.next());
		 }
		 
		 studentSet.remove("Hari Shrestha");
		 
		 System.out.println("Final : "+studentSet);
		 
		 
		 HashSet<Integer> setA = new HashSet<>();
		 setA.add(1);
		 setA.add(2);
		 setA.add(3);
		 setA.add(4);
		 
		 HashSet<Integer> setB = new HashSet<>();
		 setB.add(100);
		 setB.add(2);
		 setB.add(300);
		 setB.add(4);

		 HashSet<Integer> intersaction = new HashSet<>(setA);
		 intersaction.retainAll(setB);
		 
		 System.out.println("Intersection : "+intersaction);
		 
		 HashSet<Integer> union = new HashSet<>(setA);
		 union.addAll(setB);
		 
		 System.out.println("Union : "+union);
		 
	}
}
