package com.basicjava.unit12;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet {

	public void paint(Graphics g) {
		g.drawString("Texas International College", 20, 20);
		g.drawOval(50, 50, 60, 60);
	}
}