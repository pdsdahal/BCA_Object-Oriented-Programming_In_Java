package com.basicjava.class13;

public class NonStaticNestedClassOuter {

	private int num1  = 100;
	
	class InnerClass{	
		public void showData() {
			System.out.println("Value of num1 is : "+num1);
		}		
	}
	
	public static void main(String[] args) {
		NonStaticNestedClassOuter outerClass = new NonStaticNestedClassOuter();
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.showData();	
	}
}