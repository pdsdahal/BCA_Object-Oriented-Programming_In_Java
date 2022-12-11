package com.basicjava.unit10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceDemo {
	
	public static void main(String[] args) {
		
		List<String> studentCSITList= new ArrayList<>();
		studentCSITList.add("Gopal");
		
		List<String> studentList = new ArrayList<>();
		studentList.add("Ram Panday");
		studentList.add("Shyam Shrestha");
		studentList.addAll(studentCSITList);

		//desc
		studentList.sort(Collections.reverseOrder());
		
		//asc
		Collections.sort(studentList);
		
		
		System.out.println("Initial List : "+studentList);
		
		System.out.println("size is : "+studentList.size());
		
		//looping statement to access data 
		
		for(int i=0;i<studentList.size();i++) {
			System.out.println("Name "+i+" : "+studentList.get(i));
		}
		
		//Iterator statement to access data 
		
		Iterator<String> sList = studentList.iterator();
		while(sList.hasNext()==true) {
			System.out.println("Name : "+sList.next());
		}
		
		studentList.remove(0);
		
		System.out.println("After removing 0 index element : "+studentList);
		
		List<Integer> rollNoList = new Stack<Integer>();
		rollNoList.add(10);
		rollNoList.add(1);
		
		List<Double> incomeList = new LinkedList<>();
		incomeList.add(34567.5678);
		incomeList.add(6789.8);
		
		List<Boolean> genderList = new Vector<>();
		genderList.add(true);
		genderList.add(false);
		
		
	}

}
