package com.oopjava.unit10.thirdclass.collection;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> hasSetDemo = new HashSet<>();
		//add element in hashset
		hasSetDemo.add("Ram Panday");
		hasSetDemo.add("Shyam Shrestha");
		hasSetDemo.add("Rita Shrestha");
		hasSetDemo.add("Hari Dahal");
		
		//access data using looping statement
		for(String data : hasSetDemo) {
			System.out.println("Data : "+data);
		}
		
		//remove data from Hashset
		hasSetDemo.remove("Shyam Shrestha");
		
		//after removed: 
		System.out.println(hasSetDemo.toString());
		
		
		//set B
		
		HashSet<String> hasSetDemoB = new HashSet<>();
		//add element in hashset
		hasSetDemoB.add("Ram Panday");
		hasSetDemoB.add("ABC Shrestha");
		hasSetDemoB.add("XYZ Shrestha");
		hasSetDemoB.add("Hari Dahal");
	
		//find intersection 
		
		HashSet<String> intersectionResult = new HashSet<>(hasSetDemo);
		intersectionResult.retainAll(hasSetDemoB);
		System.out.println("Intersecton : "+intersectionResult.toString());
		
		HashSet<String> unionResult = new HashSet<>(hasSetDemo);
		unionResult.addAll(hasSetDemoB);
		System.out.println("Union : "+unionResult.toString());
		
		
	}

}
