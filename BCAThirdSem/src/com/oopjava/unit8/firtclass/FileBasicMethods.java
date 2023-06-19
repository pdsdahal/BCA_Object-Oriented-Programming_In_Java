package com.oopjava.unit8.firtclass;

import java.io.File;

public class FileBasicMethods {
	
	public static void main(String[] args) {
		
		File file = new File("target.txt");
		//exists
		boolean checkFileExist =  file.exists();
		
		System.out.println("File Exist check : "+checkFileExist);
	
		//list
		File basePath = new File("F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCAThirdSem");
		String[] files =  basePath.list();
		
		for(String fileName : files) {
			System.out.println("fileName : "+fileName);
		}
	
		//size 
		System.out.println("Size : "+file.length());
		
		//getName
		String fileName = file.getName();
		System.out.println("File Name : "+fileName);
		
		//delete
		boolean deletCheck = file.delete();
		
	}

}
