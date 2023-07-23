package com.oopjava.unit11.javaapplicatons.thirdclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplayName extends JFrame implements ActionListener {
	
	JLabel lblFirstName, lblLastName, lblFullName;
	JTextField txtFirstName, txtLastName, txtResult;
	JButton btnclick;
	
	
	public DisplayName() {
		setTitle("Show Full Name");
		setBounds(10, 10, 400, 300);
		setLayout(null);
		
		lblFirstName = new JLabel("First Name : ");
		lblFirstName.setBounds(15, 15, 100, 40);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(120, 15, 150, 40);
		
		lblLastName = new JLabel("Last Name : ");
		lblLastName.setBounds(15, 60, 100, 40);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(120, 60, 150, 40);
		
		btnclick = new JButton("Show Full Name");
		btnclick.setBounds(15, 105, 350, 40);
		btnclick.addActionListener(this);
		
		lblFullName = new JLabel("Full Name : ");
		lblFullName.setBounds(15, 150, 100, 40);
		
		txtResult = new JTextField();
		txtResult.setBounds(120, 150, 250, 40);
		
		add(lblFirstName);
		add(txtFirstName);
	
		add(lblLastName);
		add(txtLastName);
		
		add(btnclick);
		
		add(lblFullName);
		add(txtResult);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new DisplayName();
	}

	public void actionPerformed(ActionEvent e) {
		String firstName = txtFirstName.getText();
		String lastName = txtLastName.getText();
		
		String fullName = firstName + " "+lastName;
		
		txtResult.setText(fullName);
	}
	
}
