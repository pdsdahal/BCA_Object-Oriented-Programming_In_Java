package com.oopjava.unit11.javaapplicatons.thirdclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplayNameUsingMouseEvent extends JFrame implements MouseListener  {
	
	JLabel lblFirstName, lblLastName, lblFullName;
	JTextField txtFirstName, txtLastName, txtResult;
	
	
	public DisplayNameUsingMouseEvent() {
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
		
		
		lblFullName = new JLabel("Full Name : ");
		lblFullName.setBounds(15, 150, 100, 40);
		
		txtResult = new JTextField();
		txtResult.setBounds(120, 150, 250, 40);
		txtResult.addMouseListener(this);
		
		
		add(lblFirstName);
		add(txtFirstName);
	
		add(lblLastName);
		add(txtLastName);
		
		
		add(lblFullName);
		add(txtResult);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new DisplayNameUsingMouseEvent();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String firstName =  txtFirstName.getText();
		String lastName = txtLastName.getText();
		String fullName = firstName + " "+lastName;
		txtResult.setText(fullName);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String firstName =  txtFirstName.getText();
		String lastName = txtLastName.getText();
		
		int lengthFirstName = firstName.length();
		int lengthLastName = lastName.length();
		
		int sum = lengthFirstName + lengthLastName;
		txtResult.setText(""+sum);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exit");
	}
	
}
