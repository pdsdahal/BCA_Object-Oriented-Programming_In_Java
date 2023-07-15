package com.oopjava.unit11.javaapplicatons.firstclass;

import javax.swing.JFrame;

public class JFrameCreationDemoWay2 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public JFrameCreationDemoWay2() {
		setTitle("JFrame Creation using oops concept");
		setBounds(10, 10, 700, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JFrameCreationDemoWay2 object = new JFrameCreationDemoWay2();
	}
}
