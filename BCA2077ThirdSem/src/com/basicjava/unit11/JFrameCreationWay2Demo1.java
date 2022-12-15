package com.basicjava.unit11;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameCreationWay2Demo1 extends JFrame {
	
	public JFrameCreationWay2Demo1() {
		setTitle("Texas International College");
		setBounds(10,10,600,600);
		
		Container container =  getContentPane();
		container.setBackground(Color.gray);
		
		setLayout(null);
		
		JLabel lblUserName = new JLabel("UserName : ");
		lblUserName.setBounds(10, 15, 100, 50);
		
		add(lblUserName);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new JFrameCreationWay2Demo1();

	}
}
