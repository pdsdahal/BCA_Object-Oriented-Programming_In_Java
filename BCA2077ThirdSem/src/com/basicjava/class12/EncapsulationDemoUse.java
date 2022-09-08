package com.basicjava.class12;

public class EncapsulationDemoUse {

	public static void main(String[] args) {
		
		EncapsulationDemo demo = new EncapsulationDemo();
		demo.setRollNo(10);
		demo.setAddress("Baneshwor 1");
		demo.setName("Ram Panday");
		
		String address = demo.getAddress();
		int rollNo = demo.getRollNo();
		String name = demo.getName();
		
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("RollNo : "+rollNo);
	}
}
