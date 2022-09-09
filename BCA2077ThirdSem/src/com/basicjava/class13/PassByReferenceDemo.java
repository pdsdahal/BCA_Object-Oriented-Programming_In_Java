package com.basicjava.class13;

import java.util.Arrays;

public class PassByReferenceDemo {

	public void display(int[] datas) {
		datas[0] = 10;
		datas[1] = 50;
	}
	
	public static void main(String[] args) {		
		int[] data = {1,5,7,8,5};
		PassByReferenceDemo demo = new PassByReferenceDemo();
		System.out.println("Before calling Display method : "+Arrays.toString(data));
		demo.display(data);
		System.out.println("After calling Display method : "+Arrays.toString(data));
	}
}