package com.basicjava.class14;

public class MultipleInheritanceChild implements MultipleInheritanceParent1, MultipleInheritanceParent2 {

	public void showMotherInfo(String name, int age) {
		
		System.out.println("From Mother");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public void showFatherInfo(String name, int age) {
		System.out.println("From Father");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);

	}
	
	public static void main(String[] args) {
		MultipleInheritanceChild demo = new MultipleInheritanceChild();
		demo.showFatherInfo("Ram Panday", 56);
		demo.showMotherInfo("Sita Panday", 50);
	}

}
