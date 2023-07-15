package com.oopjava.unit10.thirdclass.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSetDemo = new TreeSet<>();
		//add element in treeSet
		treeSetDemo.add("Ram Panday");
		treeSetDemo.add("Shyam Shrestha");
		treeSetDemo.add("Rita Shrestha");
		treeSetDemo.add("Hari Dahal");
		
		//access data using looping statement
		for(String data : treeSetDemo) {
			System.out.println("Data : "+data);
		}
		
		//remove data from treeSet
		treeSetDemo.remove("Shyam Shrestha");
		
		//after removed: 
		System.out.println(treeSetDemo.toString());
		
		
	}

}
