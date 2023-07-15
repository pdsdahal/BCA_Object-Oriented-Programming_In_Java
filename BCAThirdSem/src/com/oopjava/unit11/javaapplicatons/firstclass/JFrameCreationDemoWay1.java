package com.oopjava.unit11.javaapplicatons.firstclass;

import javax.swing.JFrame;

public class JFrameCreationDemoWay1 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JFrame Creation");
		frame.setBounds(10, 10, 700, 600);
		

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
