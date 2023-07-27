package com.oopjava.unit12.javaapplets;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayTextMessage extends Applet implements ActionListener {

	Button btnClick;
	
	public void init() {
		btnClick = new Button("Change Background Color");
		btnClick.addActionListener(this);
		
		this.add(btnClick);
		
	}
	

	public void paint(Graphics g) {
		g.drawString("Texas International College", 10, 10);
		
		g.drawOval(100, 100, 100, 100);
		
		int[] x = {200,350,250};
		int[] y  = {350,350,250};
		g.drawPolygon(x, y, 3);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.green);		
	}
}
