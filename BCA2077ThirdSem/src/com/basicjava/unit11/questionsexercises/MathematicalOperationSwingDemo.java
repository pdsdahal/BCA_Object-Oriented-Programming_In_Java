package com.basicjava.unit11.questionsexercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MathematicalOperationSwingDemo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JLabel lblNumber1, lblNumber2, lblResult;
	JTextField txtNumber1, txtNumber2, txtResult;

	JButton btnAdd, btnSubstract, btnDiv, btnMul;

	public MathematicalOperationSwingDemo() {

		setBounds(5, 5, 500, 400);
		setLayout(null);
		setTitle("Mathematical Operation");

		lblNumber1 = new JLabel("Number 1 : ");
		lblNumber1.setBounds(5, 5, 100, 50);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(110, 5, 200, 50);

		lblNumber2 = new JLabel("Number 2 : ");
		lblNumber2.setBounds(5, 60, 100, 50);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(110, 60, 200, 50);

		btnAdd = new JButton("+");
		btnAdd.setBounds(5, 120, 100, 50);
		btnAdd.addActionListener(this);

		btnSubstract = new JButton("-");
		btnSubstract.setBounds(110, 120, 100, 50);
		btnSubstract.addActionListener(this);

		btnDiv = new JButton("/");
		btnDiv.setBounds(220, 120, 100, 50);
		btnDiv.addActionListener(this);

		btnMul = new JButton("*");
		btnMul.setBounds(330, 120, 100, 50);
		btnMul.addActionListener(this);

		lblResult = new JLabel("Result : ");
		lblResult.setBounds(0, 200, 100, 50);

		txtResult = new JTextField();
		txtResult.setBounds(110, 200, 200, 50);

		add(lblNumber1);
		add(txtNumber1);

		add(lblNumber2);
		add(txtNumber2);

		add(lblResult);
		add(txtResult);

		add(btnAdd);
		add(btnSubstract);
		add(btnDiv);
		add(btnMul);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new MathematicalOperationSwingDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btnSource = (JButton) e.getSource();
		String operation = btnSource.getText();

		double num1 = Double.parseDouble(txtNumber1.getText());
		double num2 = Double.parseDouble(txtNumber2.getText());

		double result = 0;
		if (operation.contentEquals("+")) {
			result = num1 + num2;
			txtResult.setText(String.valueOf(result));

		} else if (operation.contentEquals("-")) {
			result = num1 - num2;
			txtResult.setText(String.valueOf(result));
		} else if (operation.contentEquals("/")) {
			result = num1/num2;
			txtResult.setText(String.valueOf(result));
		}else {
			result = num1*num2;
			txtResult.setText(String.valueOf(result));
		}
	}
}