package com.oopjava.unit11.javaapplicatons.forthclass.mvc;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingView extends JFrame {
	
	JTextField txtResult;
	JButton btnClick;
	
	public SwingView() {
		setTitle("Swing MVC View");
		setBounds(10, 10, 300, 300);
		setLayout(new GridLayout(2,1));
		
		txtResult = new JTextField(20);
		btnClick = new JButton("Click Me..");
		
		add(txtResult);
		add(btnClick);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JButton getBtn() {
		return btnClick;
	}
	
	public JTextField getTextField() {
		return txtResult;
	}
	
}
