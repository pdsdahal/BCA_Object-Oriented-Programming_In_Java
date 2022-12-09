package com.basicjava.unit9;

public class EnumerationDemo {

	enum Gender{
		Male,
		FeMale,
		Other
	}
	public static void main(String[] args) {
		
		Gender gender =  Gender.Male;
		System.out.println("Specific : "+gender);
		
		//Display 
		Gender[] genders =  Gender.values();
		for(int i=0;i<genders.length;i++) {
			System.out.println(genders[i]);
		}
	}
}
