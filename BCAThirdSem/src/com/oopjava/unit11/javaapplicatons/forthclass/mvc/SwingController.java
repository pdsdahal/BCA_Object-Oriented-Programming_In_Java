package com.oopjava.unit11.javaapplicatons.forthclass.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingController {
	
	private SwingView view;
	private SwingModel model;
	
	public SwingController(SwingView view, SwingModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void btnCick() {
		view.getBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.setCount();
				int count = model.getCount();
				view.getTextField().setText(""+count);
			}
		});
		
	}

}
