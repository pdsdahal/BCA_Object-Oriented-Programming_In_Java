package com.oopjava.unit9.firstclass;

public class LangPackageObjectClassDemo {

	public static void main(String[] args) {
		
		//Integer
		Integer data = 13;
		Integer data2 = 13;
		
		//Convert from Wrapper type to primitive type
		int dataInt = data;
		
		float dataFloat = data.floatValue();
		double dataDouble = data.doubleValue();
		String dataString =  data.toString();
		
		int result = data.compareTo(data2);
		System.out.println(data+" Using compare To method : "+data2 + " = "+result);
		
		//Double
		Double data3 = 12.5;
		Double data4 = 12.5;
		
		
		//Object
		
		Object collegeName = "Texas International College";
		Object phoneNo = 1234567;
		Object collegePAN = 12345.5678;
		
		String collegeNameString = collegeName.toString();
		int phoneNoInt = Integer.parseInt(phoneNo.toString());
		double collegePanDouble = Double.parseDouble(collegePAN.toString());
		
		System.out.println("College Name : "+collegeNameString);
		System.out.println("PhoneNo : "+phoneNoInt);
		System.out.println("Pan no : "+collegePanDouble);
	}
	
	
}
