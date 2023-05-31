package com.oopjava.unit4.secondclass;

public class MultilevelClassC extends MultilevelClassB {

	public void setChildInfo(int age, String name) {
		super.setAge(age);
		super.setName(name);
	}
	
	public void showChildInfo() {
		System.out.println("Child Info");
		System.out.println("Name : "+super.name);
		System.out.println("Age : "+super.age);
	}
	
	public static void main(String[] args) {
		MultilevelClassC child = new MultilevelClassC();
		//Grand Pa
		child.setName("G. Ram");
		child.setAge(90);
		child.showClassAInfo();
		
		//Pare
		child.setParentDetails(40, "Shyam");
		child.showParentInfo();
		
		//child
		child.setChildInfo(10, "Sita");
		child.showChildInfo();	
	}
	
}
