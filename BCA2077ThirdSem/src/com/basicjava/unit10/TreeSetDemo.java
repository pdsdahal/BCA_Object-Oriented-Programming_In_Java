package com.basicjava.unit10;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Double> income = new TreeSet<>();
		income.add(3456.5678);
		income.add(45678.0);
		income.add(34567.678);
		
		System.out.println("Original : "+income);
		
		double firstIndexElement =  income.first();
		System.out.println("First Index : "+firstIndexElement);
		
		Iterator<Double> incomeList =  income.iterator();
		while(incomeList.hasNext()) {
			System.out.println(incomeList.next());
		}
		
		income.remove(45678.0);
		System.out.println("Final : "+income);
		
		//for each
		System.out.println("Using For each");
		for(Double data : income) {
			System.out.println(data);
		}
	}
}
