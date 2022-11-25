package com.basicjava.unit8;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		
		String basePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources";
	
		File file = new File(basePath);
		
		String[] dataList =  file.list();
		
		for(String data : dataList) {
			System.out.println(data);
		}
		
	}
}
