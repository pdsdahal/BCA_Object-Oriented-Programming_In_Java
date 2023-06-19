package com.oopjava.unit8.secondclass;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class WriteConsole {

	public static void main(String[] args) {

		try {
			
			//way -1 
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			bufferedWriter.write("Texas College ");
			bufferedWriter.write("Address  : Mitrapark");
			
			bufferedWriter.close();
			outputStreamWriter.close();
			
			
		} catch (Exception e) {
		}
		
		
	}

}
