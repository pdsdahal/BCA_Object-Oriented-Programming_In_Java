package com.oopjava.unit3.thirdclass;

public class JavaRecursionDemo {

	int flag = 0;
	public void getData() {
		
		if(flag < 10) {
			System.out.println("Get Data : "+flag);
			flag  = flag + 1;
			getData();
		}
	}
	
	
	public static void main(String[] args) {
		JavaRecursionDemo demo =  new JavaRecursionDemo();
		demo.getData();
	}
	
}
