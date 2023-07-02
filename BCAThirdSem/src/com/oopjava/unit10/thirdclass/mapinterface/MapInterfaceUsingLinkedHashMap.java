package com.oopjava.unit10.thirdclass.mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceUsingLinkedHashMap {

	public static void main(String[] args) {
		
		Map<String, String> linkedHashMAp = new LinkedHashMap<>();
		//data add
		linkedHashMAp.put("us", "United State");
		linkedHashMAp.put("npl", "Nepal");
		linkedHashMAp.put("ktm", "Kathmandu");
		
		
		//data get
		String valueOfNpl = linkedHashMAp.get("npl");
		System.out.println("Value : "+valueOfNpl);

		//iteratively display 
		
		Set<String> keys =  linkedHashMAp.keySet();
		for(String key : keys) {
			System.out.println("key : "+key+" Value : "+linkedHashMAp.get(key));
		}
		
		//remove 
		
		linkedHashMAp.remove("us");
		
		System.out.println("After removed");
		System.out.println(linkedHashMAp.toString());
		
		
		
	}
	
}
