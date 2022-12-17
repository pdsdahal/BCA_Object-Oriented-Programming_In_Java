package com.basicjava.unit11.questionsexercises;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorBackGroundChange extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JFrame frame;

	JButton btnYellow, btnBlue, btnPink;
	
	public ColorBackGroundChange() {
		frame = new JFrame();
		setTitle("Color Change");
		setBounds(10, 10, 350, 400);
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 30, 30);
		setLayout(flowLayout);
		
		btnYellow = new JButton("Yellow");
		btnYellow.addActionListener(this);
		
		btnBlue = new JButton("Blue");
		btnBlue.addActionListener(this);
		
		btnPink = new JButton("Pink");
		btnPink.addActionListener(this);
		
		add(btnYellow);
		add(btnBlue);
		add(btnPink);
		

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = e.getActionCommand();
		Container container =  getContentPane();
		
		if(btnName.contentEquals("Yellow")) {
			container.setBackground(Color.YELLOW);
		}else if(btnName.contentEquals("Blue")) {
			container.setBackground(Color.BLUE);
		}else {
			container.setBackground(Color.PINK);
		}
	}

	public static void main(String[] args) {
		new ColorBackGroundChange();
	}
}