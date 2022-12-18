package com.basicjava.unit11;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingMVCViewDemo extends JFrame {

	JTextField txtResult;
	JButton btnClick;
	
	public SwingMVCViewDemo() {
		setTitle("Increment Demo using swing mvc design");
		setBounds(10, 10, 300, 300);
		
		GridLayout gridLayout = new GridLayout(2, 1, 20, 20);
		setLayout(gridLayout);
		
		txtResult = new JTextField(5);
		txtResult.setText("0");
		
		btnClick = new JButton("Click Me..");
		
		add(txtResult);
		add(btnClick);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JTextField getJTextField() {
		return txtResult;
	}
	
	public JButton getButton() {
		return btnClick;
	}
}
