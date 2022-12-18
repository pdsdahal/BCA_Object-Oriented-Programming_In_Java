package com.basicjava.unit11;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame {
	

	private static final long serialVersionUID = 1L;

	JLabel lblUsername, lblPassword;
	
	JTextField txtUsername;
	JPasswordField txtPassword;
	
	public FlowLayoutDemo() {
		
		setBounds(10, 10, 500, 300);
		setTitle("Flow Layout Demo");
	
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 10);
		setLayout(layout);
		
		lblUsername =  new JLabel("UseerName : ");
		lblPassword = new JLabel("Password : ");
		
		
		txtUsername = new JTextField(5);
		txtPassword = new JPasswordField(5);
		
		
		add(lblUsername);
		add(txtUsername);
		add(lblPassword);
		add(txtPassword);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new FlowLayoutDemo();
		
	}
}
