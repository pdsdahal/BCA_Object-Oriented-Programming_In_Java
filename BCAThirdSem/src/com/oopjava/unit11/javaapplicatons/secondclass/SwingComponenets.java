package com.oopjava.unit11.javaapplicatons.secondclass;

import java.awt.*;
import javax.swing.*;

public class SwingComponenets {
	
	public static void main(String[] args) {
		

		JFrame mainFrame = new JFrame("Swing Components");
		mainFrame.setBounds(10, 10, 700, 600);
		mainFrame.setLayout(null);
		//background color
		Container container =  mainFrame.getContentPane();
		//container.setBackground(Color.WHITE);
		//Label
		JLabel lblRegistration = new JLabel("Registration Form");
		lblRegistration.setBounds(250, 10, 250, 40);
		
		JLabel lblName = new JLabel("First Name : ");
		lblName.setBounds(15,45,200, 40);
		
		
		JTextField txtFirstName = new JTextField();
		txtFirstName.setBounds(220, 45, 200, 40);
		
		JLabel lblLastName  = new JLabel("Last Name : ");
		lblLastName.setBounds(15, 90, 200, 40);
		
		//JTextField
		JTextField txtLastName = new JTextField();
		txtLastName.setBounds(220, 90, 200, 40);
		
		//JLabel
		JLabel lblPassword  = new JLabel("Password : ");
		lblPassword.setBounds(15, 135, 200, 40);
		
		//JPasswordField
		JPasswordField txtPassword = new JPasswordField();
		txtPassword.setBounds(220, 135, 200, 40);
		
		
		//JLabel
		JLabel lblDescription  = new JLabel("Description : ");
		lblDescription.setBounds(15, 180, 200, 40);
		
		//JTextArea
		JTextArea txtDescription = new JTextArea();
		txtDescription.setBounds(220, 180, 200, 100);
		
		//JButton
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(220, 290, 200, 40);
		
		JLabel lblCountry = new JLabel("Country : ");
		lblCountry.setBounds(15, 335, 200, 40);

		//JCheckBox
		JCheckBox chkNepal = new JCheckBox("Nepal");
		JCheckBox chkIndia = new JCheckBox("India");
		JCheckBox chkAmerica = new JCheckBox("America");
		
		JPanel chkPanel = new JPanel();
		chkPanel.add(chkNepal);
		chkPanel.add(chkAmerica);
		chkPanel.add(chkIndia);
		chkPanel.setBounds(220, 335, 300, 40);
		
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setBounds(15, 370, 200, 40);
		
		//JRadioButton
		JRadioButton rdBtnMale = new JRadioButton("Male");
		JRadioButton rdBtnFeMale = new JRadioButton("FeMale");
		JRadioButton rdBtnOther = new JRadioButton("Other");
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(rdBtnOther);
		genderGroup.add(rdBtnFeMale);
		genderGroup.add(rdBtnMale);
		
		JPanel rdbntPanels = new JPanel();
		rdbntPanels.add(rdBtnMale);
		rdbntPanels.add(rdBtnFeMale);
		rdbntPanels.add(rdBtnOther);
		rdbntPanels.setBounds(220, 370, 300, 40);
		
		
		JLabel lblLanuages = new JLabel("Language : ");
		lblLanuages.setBounds(15, 415, 200, 40);
		
		Object[] language = {"Nepali","English","Hindi","Other"};
		JComboBox<Object> cmBoxLanguage = new JComboBox<>(language);
		cmBoxLanguage.setBounds(220, 415, 200, 40);
		
		
		//add components 
		mainFrame.add(lblName);
		mainFrame.add(lblRegistration);
		mainFrame.add(txtFirstName);
		mainFrame.add(lblLastName);
		mainFrame.add(txtLastName);
		mainFrame.add(lblPassword);
		mainFrame.add(txtPassword);
		mainFrame.add(lblDescription);
		mainFrame.add(txtDescription);
		mainFrame.add(btnSubmit);
		mainFrame.add(lblCountry);
		mainFrame.add(chkPanel);
		mainFrame.add(lblGender);
		mainFrame.add(rdbntPanels);
		mainFrame.add(lblLanuages);
		mainFrame.add(cmBoxLanguage);
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
