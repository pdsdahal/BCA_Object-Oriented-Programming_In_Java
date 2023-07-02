package com.oopjava.unit10.seocndclass.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListIntefaceUsingArrayList {

	public static void main(String[] args) {
		
		//Interface  : implemented class 
		List<String> listDemo = new ArrayList<String>();
		listDemo.add("Ram Panday");
		listDemo.add("Sita Dahal");
		listDemo.add("Gita Panday");
		listDemo.add("Apple ");
		
		//for loop
		
		for(int i=0;i<listDemo.size();i++) {
			System.out.println("Data : "+listDemo.get(i));
		}
		
		//using do while
		
		int flag = 0;
		
		do {
			System.out.println("Do While - Data : "+listDemo.get(flag));
			flag++;
		}while(flag<listDemo.size());
	
		//using while
		
		int counterFalg = 0;
		while(counterFalg< listDemo.size()) {
			System.out.println("While - Data : "+listDemo.get(counterFalg));
			counterFalg++;
		}
		
		
		//using for each 
		System.out.println("Usig foreach...\n\n");
		for(String data : listDemo) {
			System.out.println(data);
		}
	}
}
