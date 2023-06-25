package com.oopjava.unit9.secondclass;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		//create the object of vector
		Vector<String> collegeNameVec = new Vector<String>();
		//add element inside the vector
		collegeNameVec.add("Texas Iternational College");
		collegeNameVec.add("Abc International College");
		collegeNameVec.add("KU");
		collegeNameVec.add("Xyz college");
		
		
		//by using index
		
		String collegeNameAtIndex1 = collegeNameVec.get(1);
		System.out.println("At index 1 : "+collegeNameAtIndex1);
		
		//Way to get all elements from vector
		for(int i=0;i<collegeNameVec.size();i++) {
			System.out.println("Index : "+i+" "+collegeNameVec.get(i));
		}
		
		
		System.out.println("Before Removing : "+collegeNameVec.size());
		collegeNameVec.remove(1);
		
		System.out.println("After Removing : "+collegeNameVec.size());
		
		System.out.println("\n\nFinal Result");
		System.out.println("At index 1 : "+collegeNameVec.get(1));
		
	}

}
