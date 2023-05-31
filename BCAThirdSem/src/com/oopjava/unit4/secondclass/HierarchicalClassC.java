package com.oopjava.unit4.secondclass;

public class HierarchicalClassC extends HierarchicalClassA {

	public void findDiff(int num1, int num2) {
		super.showDiff(num1, num2);
	}
	
	public static void main(String[] args) {
		
		
		HierarchicalClassC childC=  new HierarchicalClassC();
		childC.findDiff(20, 10);
	}
}
