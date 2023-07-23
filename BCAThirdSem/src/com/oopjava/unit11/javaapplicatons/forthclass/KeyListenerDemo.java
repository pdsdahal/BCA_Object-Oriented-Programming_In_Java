package com.oopjava.unit11.javaapplicatons.forthclass;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame implements KeyListener {
	
	JLabel lblTypeAnyChar;
	JTextField txtCharField;
	
	Container container;
	
	public KeyListenerDemo() {
		
		setTitle("Key Listener Demo");
		setBounds(10, 10, 600, 500);
		setLayout(null);
		
		lblTypeAnyChar = new JLabel("Type Any Char....");
		lblTypeAnyChar.setBounds(15, 15, 200, 40);
		
		txtCharField = new JTextField();
		txtCharField.setBounds(220, 15, 200, 40);
		txtCharField.addKeyListener(this);
		
		container = getContentPane();
		
		
		add(lblTypeAnyChar);
		add(txtCharField);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new KeyListenerDemo();
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed..");
		
	}

	public void keyReleased(KeyEvent e) {
		try {
			char input = txtCharField.getText().charAt(0);
			if(input=='g') {
				container.setBackground(Color.GREEN);
			}else {
				container.setBackground(Color.RED);
			}
	
		}catch(Exception ex) {
			
		}
				

	}
	
	

}
