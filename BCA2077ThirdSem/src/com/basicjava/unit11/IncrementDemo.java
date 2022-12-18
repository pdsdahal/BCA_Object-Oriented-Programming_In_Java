package com.basicjava.unit11;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class IncrementDemo extends JFrame implements ActionListener {
	
	JTextField txtResult;
	JButton btnClick;
	
	int count = 0;
	public IncrementDemo() {
		setTitle("Increment Demo");
		setBounds(10, 10, 300, 300);
		
		GridLayout gridLayout = new GridLayout(2, 1, 20, 20);
		setLayout(gridLayout);
		
		txtResult = new JTextField(5);
		txtResult.setText(""+count);
		
		btnClick = new JButton("Click Me..");
		btnClick.addActionListener(this);
		
		add(txtResult);
		add(btnClick);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new IncrementDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count = count  +1;
		txtResult.setText(""+count);
		
	}

}
