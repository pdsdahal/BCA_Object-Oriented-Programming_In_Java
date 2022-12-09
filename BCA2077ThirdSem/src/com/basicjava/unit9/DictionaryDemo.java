package com.basicjava.unit9;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo {

	public static void main(String[] args) {
		
		//put
		Dictionary<Integer, String> studentDictionary = new Hashtable<Integer, String>();
		studentDictionary.put(1, "Ram Panday");
		studentDictionary.put(10, "Shyam Shrestha");
		studentDictionary.put(100, "Sita Bhandari");
		
		System.out.println("Initial Dictionary : "+studentDictionary);
		//size
		System.out.println("Size of disctionary : "+studentDictionary.size());
		
		//Display
		Enumeration<String> studentsData =  studentDictionary.elements();
		while(studentsData.hasMoreElements()) {
			System.out.println(studentsData.nextElement());
		}
		
		//remove
		String removedElement = studentDictionary.remove(10);
		System.out.println("Removed Element : "+removedElement);
		
		//get specified element 
		String studentName = studentDictionary.get(100);
		System.out.println("Student Name : "+studentName);
	
		System.out.println("After removed operation : "+studentDictionary);
	
		//display key and value i pair 
		
		Enumeration<Integer> studentKey = studentDictionary.keys();
		while(studentKey.hasMoreElements()) {
			int key  = studentKey.nextElement();
			String value =  studentDictionary.get(key);
			System.out.println("key : "+key + " , value : "+value);
			
		}
	}
}
