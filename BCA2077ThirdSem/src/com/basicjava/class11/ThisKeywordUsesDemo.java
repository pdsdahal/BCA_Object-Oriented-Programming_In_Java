package com.basicjava.class11;

public class ThisKeywordUsesDemo {

	private int id;
	private String name;
	private String address;
	
	//A) this: to refer current class instance variable
	public ThisKeywordUsesDemo(int id, String name, String address) {
		//B) this() : to invoke current class constructor
		this();
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public ThisKeywordUsesDemo() {
		System.out.println("Inside the default constructor.");
	}
	
	public void showStudentId() {
		System.out.println("Id is : "+id);	
	}
	
	
	public void showStudentnfo() {
		//B) this: to invoke current class method
		this.showStudentId();
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+address);
	}
	
	public void passArgmentMethod(ThisKeywordUsesDemo thisdemo) {
		System.out.println("Method called");
	}
	
	public void displayPassArgument() {
		//D) this: to pass as an argument in the method
		passArgmentMethod(this);
	}
	
	public int getId() {
		return this.id;
	}
	
	public static void main(String[] args) {
		ThisKeywordUsesDemo demo =  new ThisKeywordUsesDemo(100, "Ram Panday", "Ktm 31");
		demo.showStudentnfo();
		int id = demo.getId();
		System.out.println("Student id : "+id);
		
		demo.displayPassArgument();
	}
	
}
