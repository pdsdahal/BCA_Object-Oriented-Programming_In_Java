package com.oopjava.unit3.secondclass;

public class NoArgConstructorDemo {
	
	public NoArgConstructorDemo() {
		System.out.println("No Argument constructor");
	}
	
	
	public void showPersonalInfo() {
		System.out.println("Name : Ram Panday");
		System.out.println("Age : 11");
	}
	
	public static void main(String[] args) {
		
		NoArgConstructorDemo demo = new NoArgConstructorDemo();
		demo.showPersonalInfo();
		
		NoArgConstructorDemo demo1 = new NoArgConstructorDemo();
		
		
	}

}
