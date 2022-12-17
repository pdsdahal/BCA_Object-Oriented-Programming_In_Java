package com.basicjava.unit11.questionsexercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SquareCalculator extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JLabel lblNumber, lblResult;
	JButton btnCalculate;
	JTextField txtNumber, txtResult;
	
	public SquareCalculator() {
		setTitle("Square Calculator");
		setBounds(10,10,400,400);
		
		setLayout(null);
		
		lblNumber = new JLabel("Enter any number : ");
		lblNumber.setBounds(10, 10, 150, 50);
		
		txtNumber = new JTextField(10);
		txtNumber.setBounds(200, 10, 150, 50);
		
		btnCalculate = new JButton("Calculate Square");
		btnCalculate.setBounds(80, 70, 150, 50);
		btnCalculate.addActionListener(this);
		
		lblResult = new JLabel("Square of entered Number : ");
		lblResult.setBounds(10, 130, 200, 50);
		
		txtResult = new JTextField(10);
		txtResult.setBounds(200, 130, 150, 50);
		txtResult.setEditable(false);
		
		add(lblNumber);
		add(txtNumber);
		add(btnCalculate);
		add(lblResult);
		add(txtResult);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(txtNumber.getText());
		int square = num * num;
		txtResult.setText(String.valueOf(square));
	}

	public static void main(String[] args) {
		new SquareCalculator();
	}
}
