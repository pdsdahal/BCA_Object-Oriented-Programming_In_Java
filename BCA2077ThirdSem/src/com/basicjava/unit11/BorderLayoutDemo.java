package com.basicjava.unit11;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	
	public BorderLayoutDemo(){
		
		setBounds(10, 10, 300, 200);
		setTitle("Border Layout");
		
		BorderLayout borderLayout = new BorderLayout(10,10);
		setLayout(borderLayout);
		
		JButton btn1 = new JButton("Btn 1");
		JButton btn2 = new JButton("Btn 2");
		JButton btn3 = new JButton("Btn 3");
		JButton btn4 = new JButton("Btn 4");
		JButton btn5 = new JButton("Btn 5");
		
		add(btn1,BorderLayout.EAST);
		add(btn2,BorderLayout.WEST);
		add(btn3,BorderLayout.NORTH);
		add(btn4,BorderLayout.SOUTH);
		add(btn5,BorderLayout.CENTER);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
