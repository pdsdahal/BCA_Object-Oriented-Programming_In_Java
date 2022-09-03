package com.basicjava.class11;

public class DefaultConstructorCall {

	public static void main(String[] args) {
		
		DefaultConstructor defaultConstructor = new DefaultConstructor();
		defaultConstructor.setCollegeAddress("Baneshwor");
		defaultConstructor.setCollgeName("Texas International College");
		
		String collegeName = defaultConstructor.getCollgeName();
		System.out.println("College Name : "+collegeName);
		
		String address = defaultConstructor.getCollegeAddress();
		System.out.println("Address : "+address);
		
	}
}
