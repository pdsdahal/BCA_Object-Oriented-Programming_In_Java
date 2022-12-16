package com.basicjava.unit11;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame {

	public KeyEventDemo() {
		setBounds(10, 10, 400, 600);
		setLayout(null);
		setTitle("Key Event Demo");
		
		JTextField txtUser = new JTextField();
		txtUser.setBounds(10, 10, 100, 60);
		
		
		JTextField txtResult = new JTextField();
		txtResult.setBounds(10, 200, 200, 60);
		
		
		txtUser.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				txtResult.setText(String.valueOf(e.getKeyChar()));
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				txtResult.setText(String.valueOf(e.getKeyChar()));
				
			}
		});
		
		add(txtUser);
		add(txtResult);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public static void main(String[] args) {
		new KeyEventDemo();
	}
}
