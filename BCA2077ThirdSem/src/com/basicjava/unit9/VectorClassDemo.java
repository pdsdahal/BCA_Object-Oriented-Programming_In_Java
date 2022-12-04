package com.basicjava.unit9;

import java.util.Vector;

public class VectorClassDemo {

	public static void main(String[] args) {
		
		Vector<Integer> dataVectors = new Vector<Integer>();
		dataVectors.add(12);
		dataVectors.add(20);
		
		int itemsAtZeroIndex = dataVectors.get(0);
		System.out.println(itemsAtZeroIndex);
		
	}
}
