package com.oopjava.unit10.thirdclass.mapinterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceUsingTreeMap {

	public static void main(String[] args) {
		
		Map<String, String> treemap =  new TreeMap<>();
		//data add
		treemap.put("us", "United State");
		treemap.put("npl", "Nepal");
		treemap.put("ktm", "Kathmandu");
		
		
		//data get
		String valueOfNpl = treemap.get("npl");
		System.out.println("Value : "+valueOfNpl);

		//iteratively display 
		
		Set<String> keys =  treemap.keySet();
		for(String key : keys) {
			System.out.println("key : "+key+" Value : "+treemap.get(key));
		}
		
		//remove 
		
		treemap.remove("us");
		
		System.out.println("After removed");
		System.out.println(treemap.toString());
		
		
		
	}
	
}
