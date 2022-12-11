package com.basicjava.unit10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> studentList = new LinkedList<String>();
		studentList.add("Ram Panday");
		studentList.add("Shyam Shrestha");
		studentList.add("Hari Panday");
		
		System.out.println("Original List : "+studentList);
		
		Iterator<String> sList =  studentList.iterator();
		while(sList.hasNext()) {
			System.out.println(sList.next());
		}
		
		studentList.remove(2);
		
		System.out.println("Final List : "+studentList);
	}

}
