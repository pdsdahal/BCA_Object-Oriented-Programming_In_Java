package com.basicjava.unit11;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame {

	public GridLayoutDemo() {
		setBounds(10, 10, 300, 300);
		setTitle("Grid Layout Demo");
		
		GridLayout gridLayout = new GridLayout(3, 2, 30, 30);
		setLayout(gridLayout);
		
		JLabel lblUserName = new JLabel("UserName : ");
		JTextField txtUserName = new JTextField(4);
		
		JLabel lblAddress = new JLabel("Address : ");
		JTextField txtAddress = new JTextField(4);
		
		JLabel lblAge = new JLabel("Age : ");
		JTextField txtAge = new JTextField(4);
		
		
		add(lblUserName);
		add(txtUserName);
		add(lblAddress);
		add(txtAddress);
		add(lblAge);
		add(txtAge);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}
