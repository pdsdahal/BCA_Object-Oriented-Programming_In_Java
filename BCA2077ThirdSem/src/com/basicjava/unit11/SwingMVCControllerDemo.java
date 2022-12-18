package com.basicjava.unit11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SwingMVCControllerDemo {

	private SwingMVCViewDemo view;
	private SwingMVCModelDemo model;
	
	public SwingMVCControllerDemo(SwingMVCViewDemo view, SwingMVCModelDemo model) {
		this.view = view;
		this.model = model;
	}
	
	
	public void btnCickEventHanding() {
		JButton btnClick =  view.getButton();
		btnClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.incrementCount();
				
				view.getJTextField().setText(""+model.getCount());
				
				
			}
		});
	}
}
