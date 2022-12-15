package com.basicjava.unit11;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameCreationWay1Demo {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Texas International College");
		frame.setBounds(10, 10, 600, 600);
		
		
		Container container =  frame.getContentPane();
		container.setBackground(Color.red);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
