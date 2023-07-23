package com.oopjava.unit11.javaapplicatons.secondclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalulatorDesign extends JFrame implements ActionListener {
	
	 JLabel lblNumber1, lblNumber2, lblResult;
	 JTextField txtNumber1, txtNumber2, txtResult;
	 JButton btnMul, btnAdd, btnSub, btnDiv;
	 
	 public CalulatorDesign(){
		 setTitle("Calculator");
		 setBounds(10, 10, 500, 400);
		 setLayout(null);
		 
		 lblNumber1 = new JLabel("Number 1 : ");
		 lblNumber1.setBounds(15, 15, 200, 40);
		 
		 txtNumber1 = new JTextField();
		 txtNumber1.setBounds(220, 15, 200, 40);
		 
		 lblNumber2 = new JLabel("Number 2 : ");
		 lblNumber2.setBounds(15, 60, 200, 40);
		 
		 txtNumber2 = new JTextField();
		 txtNumber2.setBounds(220, 60, 200, 40);
		 
		 btnMul = new JButton(" X ");
		 btnMul.setBounds(15, 105, 100, 40);
		 btnMul.setActionCommand("Mul");
		 btnMul.addActionListener(this);
		 
		 btnAdd = new JButton(" + ");
		 btnAdd.setBounds(120, 105, 100, 40);
		 btnAdd.setActionCommand("Add");
		 btnAdd.addActionListener(this);
		 
		 
		 btnSub = new JButton(" - ");
		 btnSub.setBounds(225, 105, 100, 40);
		 
		 btnDiv = new JButton(" / ");
		 btnDiv.setBounds(330, 105, 100, 40);
		 
		 lblResult = new JLabel("Result : ");
		 lblResult.setBounds(15, 150, 100, 40);
		 
		 txtResult = new JTextField();
		 txtResult.setBounds(120, 150, 100, 40);
		 
		 
		 add(lblNumber1);
		 add(txtNumber1);
		 
		 add(lblNumber2);
		 add(txtNumber2);
		 
		 add(btnMul);
		 add(btnAdd);
		 add(btnSub);
		 add(btnDiv);
		 
		 add(lblResult);
		 add(txtResult);
		 
		 
		 
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		int num1 = Integer.parseInt(txtNumber1.getText());
		int num2  = Integer.parseInt(txtNumber2.getText());
	
		if(actionCommand.equals("Add")) {
			int add = num1 + num2;
			txtResult.setText(""+add);
			
		}else if(actionCommand.equals("Mul")) {
			int mul = num1 * num2;
			txtResult.setText(""+mul);
		}
	}
	
	 public static void main(String[] args) {
			new CalulatorDesign();
		}
}
