package com.basicjava.unit9;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String, String> employeeHash = new Hashtable<String, String>();
		employeeHash.put("Ram Panday", "Baneshwor 1");
		employeeHash.put("Shyam Shrestha", "Baneshwor 32");
		employeeHash.put("Gopal Dahal", "Bhaktapur 1");
		
		System.out.println(employeeHash.size());
		
		String address = employeeHash.get("Shyam Shrestha");
		System.out.println("Address of Shyam Shrestha : "+address);
		
		//display 
		
		Enumeration<String> employeeKeys =  employeeHash.keys();
		 while(employeeKeys.hasMoreElements()) {
			 
			 String key = employeeKeys.nextElement();
			 String value = employeeHash.get(key);
			 System.out.println("key : "+key + " , Value : "+value);
			 
		 }
		
		
	}
}
