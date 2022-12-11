package com.basicjava.unit10;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		
		//key , value
		Map<Integer, String> employeeMap = new HashMap<Integer, String>(); 
		employeeMap.put(101, "Ram Panday");
		employeeMap.put(102, "Shyam Panday");
		employeeMap.put(103, "Hari Panday");
		
		System.out.println("Initial Map : "+employeeMap);
		
		String employeeName = employeeMap.get(102);
		System.out.println("Name : "+employeeName);
		

		for(Integer key :  employeeMap.keySet()) {
			System.out.println("Key : "+key + " , Name : "+ employeeMap.get(key));
		}
		
		int size = employeeMap.size();
		System.out.println("Size of Map : "+size);
		
		employeeMap.remove(103);
		
		System.out.println("After removed : "+employeeMap);
		
	}
}
