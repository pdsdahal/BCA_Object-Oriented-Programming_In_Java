package com.oopjava.unit11.javaapplicatons.forthclass;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

	JButton btnEast, btnWest, btnNorth, btnSouth, btnCenter;
	
	public BorderLayoutDemo() {
		setTitle("Border Layout");
		setBounds(10, 10, 600, 500);
		
		BorderLayout borderLayout = new BorderLayout(10, 10);
		setLayout(borderLayout);
		
		btnEast = new JButton("EAST");
		btnWest = new JButton("WEST");
		btnNorth = new JButton("NORTH");
		btnSouth = new JButton("SOUTH");
		btnCenter = new JButton("CENTER");
		
		add(btnEast, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		add(btnNorth, BorderLayout.NORTH);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnCenter, BorderLayout.CENTER);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
	
}
