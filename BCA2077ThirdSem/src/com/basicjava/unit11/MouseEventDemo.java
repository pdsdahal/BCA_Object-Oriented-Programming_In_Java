package com.basicjava.unit11;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MouseEventDemo extends JFrame {
	
	public MouseEventDemo() {
		setBounds(10, 10, 600, 500);
		setLayout(null);
		setTitle("Mouse Event");
		
		JTextField txtResult = new JTextField();
		txtResult.setBounds(10, 10, 100, 50);
		
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				txtResult.setText("Mouse Released");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				txtResult.setText("Mouse Pressed");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
				txtResult.setText("Mouse Exited");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				txtResult.setText("Mouse Enetered");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(txtResult);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventDemo();
	}

}
