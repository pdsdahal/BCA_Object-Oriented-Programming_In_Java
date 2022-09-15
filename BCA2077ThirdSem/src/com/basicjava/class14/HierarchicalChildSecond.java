package com.basicjava.class14;

public class HierarchicalChildSecond extends HierarchicalParent {

	private int age;
	private String name;

	public HierarchicalChildSecond(String phoneNo, String address, int age, String name) {
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
		HierarchicalChildSecond child = new HierarchicalChildSecond("98765432", "Bhaktapur 31", 17, "Sita Panday");
		child.showResults();
				
	}
}
