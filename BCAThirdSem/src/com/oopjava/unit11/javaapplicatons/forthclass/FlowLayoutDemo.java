package com.oopjava.unit11.javaapplicatons.forthclass;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame {

	JLabel lblName, lblAddress;
	JTextField txtName, txtAddress;
	JButton btnSubmit;
	
	
	public FlowLayoutDemo() {
		setTitle("Flow Layout");
		setBounds(10, 10, 300, 500);
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(flowLayout);
		
		lblName = new JLabel("Name : ");
		txtName = new JTextField(20);
		
		lblAddress =  new JLabel("Address : ");
		txtAddress = new JTextField(20);
		
		btnSubmit = new JButton("Submit");

		add(lblName);
		add(txtName);
		
		add(lblAddress);
		add(txtAddress);
		
		add(btnSubmit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
	
}
