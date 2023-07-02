package com.oopjava.unit10.thirdclass.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceUsingHashMap {

	public static void main(String[] args) {
		
		Map<String, String> hashmap =  new HashMap<>();
		//data add
		hashmap.put("us", "United State");
		hashmap.put("npl", "Nepal");
		hashmap.put("ktm", "Kathmandu");
		
		
		//data get
		String valueOfNpl = hashmap.get("npl");
		System.out.println("Value : "+valueOfNpl);

		//iteratively display 
		
		Set<String> keys =  hashmap.keySet();
		for(String key : keys) {
			System.out.println("key : "+key+" Value : "+hashmap.get(key));
		}
		
		//remove 
		
		hashmap.remove("us");
		
		System.out.println("After removed");
		System.out.println(hashmap.toString());
		
		
		
	}
	
}
