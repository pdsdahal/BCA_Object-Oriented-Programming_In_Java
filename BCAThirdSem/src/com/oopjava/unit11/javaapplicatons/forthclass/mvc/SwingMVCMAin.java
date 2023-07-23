package com.oopjava.unit11.javaapplicatons.forthclass.mvc;

public class SwingMVCMAin {
	
	public static void main(String[] args) {
		
		SwingModel model = new SwingModel();
		SwingView view = new SwingView();
		
		SwingController controller = new SwingController(view, model);
		controller.btnCick();
	}

}
