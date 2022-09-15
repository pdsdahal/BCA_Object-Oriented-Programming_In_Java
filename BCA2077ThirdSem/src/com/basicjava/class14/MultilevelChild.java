package com.basicjava.class14;

public class MultilevelChild extends MultilevelParent {

	public void showChildInfo() {
		System.out.println("\n");
		System.out.println("Name : Hari Dahal");
		System.out.println("Age : 20");
		System.out.println("Address : Bhaktapur 1");
	}	
	
	public static void main(String[] args) {
		MultilevelChild child = new MultilevelChild();
		child.showGrandParentInfo();
		child.showParentInfo();
		child.showChildInfo();
	}
}
