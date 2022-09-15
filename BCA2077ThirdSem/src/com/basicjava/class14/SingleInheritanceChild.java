package com.basicjava.class14;

public class SingleInheritanceChild  extends SingleInheritanceParent {

	public void displayChildInfo() {
		System.out.println("Name : Sita Panday");
		System.out.println("Age : 20");
	}
	
	public static void main(String[] args) {
		SingleInheritanceChild child = new SingleInheritanceChild();
		child.displayChildInfo();
		child.displayParentInfo();
	}
}
