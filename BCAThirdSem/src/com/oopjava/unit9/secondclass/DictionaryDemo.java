package com.oopjava.unit9.secondclass;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo {
	
	public static void main(String[] args) {
	
		Dictionary<Integer, String> students = new Hashtable<Integer, String>();
		students.put(1, "Ram Panday");
		students.put(2, "Shyam Shrestha");
		students.put(3, "Hari Dahal");
		
		int keyName = 2;
		String valueOfKey = students.get(keyName);
		
		System.out.println("key : "+keyName + " value "+valueOfKey);
		
		
		Enumeration<Integer> keys =  students.keys();
		Enumeration<String> values =  students.elements();
		System.out.println("\n\nFetch all data from Dictionary......");
		
		while(values.hasMoreElements()) {
			String value = values.nextElement();
			Integer key = keys.nextElement();
			
			System.out.println("Key : "+key + " Value : "+value);
		}
	}

}
