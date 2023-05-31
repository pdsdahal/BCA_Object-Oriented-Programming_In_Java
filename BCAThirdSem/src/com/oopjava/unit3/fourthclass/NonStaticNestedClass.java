package com.oopjava.unit3.fourthclass;

public class NonStaticNestedClass {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public class InnerClass{
		
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		
		
		NonStaticNestedClass outerClass = new NonStaticNestedClass();
		outerClass.setName("Ram Panday");
		
		InnerClass innerClass =   outerClass.new InnerClass();
		String name  = innerClass.getName();
		System.out.println("Name : "+name);
		
	}

}
