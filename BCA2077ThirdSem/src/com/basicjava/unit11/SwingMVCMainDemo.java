package com.basicjava.unit11;

public class SwingMVCMainDemo {
	
	public static void main(String[] args) {
		
		SwingMVCModelDemo model = new SwingMVCModelDemo();
		SwingMVCViewDemo view = new SwingMVCViewDemo();
		
		SwingMVCControllerDemo controller = new SwingMVCControllerDemo(view, model);
		controller.btnCickEventHanding();
		
	}

}
