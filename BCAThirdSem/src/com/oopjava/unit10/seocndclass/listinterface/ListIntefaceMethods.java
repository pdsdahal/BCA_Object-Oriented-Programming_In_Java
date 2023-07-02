package com.oopjava.unit10.seocndclass.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListIntefaceMethods {

	public static void main(String[] args) {
		
		List<Integer> dataList=  new ArrayList<>();
		for(int i=0;i<10;i++) {
			dataList.add(i);
		}
		//size 
		System.out.println("Size : "+dataList.size());
		
		//get element by index 
		System.out.println("Get emelemtn from index  : "+dataList.get(3));
		
		//remove 
		System.out.println("Before Remove : "+dataList.toString());
		dataList.remove(4);
		System.out.println("After Remove : "+dataList.toString());
		
		//contains
		if(dataList.contains(3)) {
			System.out.println("Matched...");
		}else {
			System.out.println("No data");
		}
		
	}
}
