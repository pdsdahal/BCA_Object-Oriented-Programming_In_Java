package com.basicjava.class7;

import com.basicjava.class6.AccessModifiersDemo;

public class AccessModifiersDemoUses extends AccessModifiersDemo {

	public static void main(String[] args) {
		
		AccessModifiersDemo demo = new AccessModifiersDemo();
		demo.data3 = "Texas International College";
		demo.printData();
		
		// using inheritance
		AccessModifiersDemoUses demo1 = new AccessModifiersDemoUses();
		double result =  demo1.income = 12345.5667;
		
		System.out.println("Using proteced variable : "+result);
		
		
	}
	
}
