package com.oopjava.unit10.thirdclass.mapinterface;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceUsingEnumMap {

	public static void main(String[] args) {
		
		enum weekdays{
			Sunday,
			Monday,
			Tuesday
		};
		
		
		Map<weekdays, String> treemap = new EnumMap<>(weekdays.class);
		//data add
		treemap.put(weekdays.Sunday, "Go to college");
		treemap.put(weekdays.Monday, "Visit Nepal");
		treemap.put(weekdays.Tuesday, "Visit Kathmandu");
		
		
		//data get
		String valueOfNpl = treemap.get(weekdays.Sunday);
		System.out.println("Value : "+valueOfNpl);

		//iteratively display 
		
		Set<weekdays> keys =  treemap.keySet();
		for(weekdays key : keys) {
			System.out.println("key : "+key+" Value : "+treemap.get(key));
		}
		
		//remove 
		
		treemap.remove(weekdays.Monday);
		
		System.out.println("After removed");
		System.out.println(treemap.toString());
		
		
		
	}
	
}
