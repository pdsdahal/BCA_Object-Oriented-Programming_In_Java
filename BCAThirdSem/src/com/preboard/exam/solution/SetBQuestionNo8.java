package com.preboard.exam.solution;

public class SetBQuestionNo8 {

	public static void main(String[] args) {
		Time time1 = new Time(5, 10, 59);
		System.out.println("Time 1 : "+time1.displayTime());
		
		Time time2 = new Time(5, 10, 02);
		System.out.println("Time 2 : "+time2.displayTime());
		
		Time addTotalTime = time1.add(time2);
		System.out.println("Time 1 + Time 2 : "+addTotalTime.displayTime());
		
		Time subTotalTime = time1.subtract(time2);
		System.out.println("Time 1 - Time 2 : "+subTotalTime.displayTime());
	}
}
