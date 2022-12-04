package com.basicjava.unit8;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteConsoleOutputDemo {

	public static void main(String[] args) throws Exception{

		//first way
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		bufferedWriter.write("\n\nTexas International College");
		
		
		//second way
		int a = 97;
		
		System.out.println("\n\n");
		System.out.write(a);
		
		//Third way
		
		PrintWriter printWriter = new PrintWriter(System.out, true);
		printWriter.print("Name : Hari Panday");
		
		
		bufferedWriter.close();
		outputStreamWriter.close();
		
	}
}
