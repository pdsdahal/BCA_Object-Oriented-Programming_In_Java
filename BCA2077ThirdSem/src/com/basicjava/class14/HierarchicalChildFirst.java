package com.basicjava.class14;

public class HierarchicalChildFirst extends HierarchicalParent {

	private int age;
	private String name;

	public HierarchicalChildFirst(String phoneNo, String address, int age, String name) {
		super(phoneNo, address);
		this.age = age;
		this.name = name;
	}
	
	public void showResults() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		super.showData();	
	}
	
	public static void main(String[] args) {
		HierarchicalChildFirst child = new HierarchicalChildFirst("12345678", "Bhaktapur 1", 12, "Ram Panday");
		child.showResults();
				
	}
}
