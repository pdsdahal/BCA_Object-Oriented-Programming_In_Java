package com.basicjava.class13;

public class RecursionDemo {

	static int i=0;
	
	public void showData() {
		if(i<10) {
			System.out.println("Texas : "+i);
			i++;
			showData();
		}
	}
	
	public static void main(String[] args) {
		RecursionDemo demo = new RecursionDemo();
		demo.showData();
	}
}