package com.basicjava.unit11.questionsexercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JLabel lblFirstName, lblLastName, lblFaculty, lblGender;
	JTextField txtFirstName, txtLastName;
	JRadioButton btnMale, btnFemale;
	JComboBox<String> cmBoxfaculty;
	JButton btnSubmit;
	
	JTextArea resultArea;

	public RegistrationForm() {
		setLayout(null);
		setBounds(5, 5, 800, 400);
		setTitle("Registration Form");

		lblFirstName = new JLabel("FirstName : ");
		lblFirstName.setBounds(5, 5, 100, 50);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(110, 5, 200, 50);
		
		lblLastName = new JLabel("LastName : ");
		lblLastName.setBounds(5, 60, 100, 50);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(110, 60, 200, 50);
		
		lblGender = new JLabel("Gender : ");
		lblGender.setBounds(5, 120, 100, 50);
		
		btnMale = new JRadioButton("Male");
		btnMale.setActionCommand("Male");
		btnMale.setBounds(110, 120, 100,50);
		
		
		btnFemale = new JRadioButton("Female");
		btnFemale.setActionCommand("FeMale");
		btnFemale.setBounds(220, 120, 100,50);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(btnMale);
		btnGroup.add(btnFemale);
		
		String[] faculty = {"BCA","CSIT","BE"};
		lblFaculty = new JLabel("Faculty : ");
		lblFaculty.setBounds(5, 180, 100, 50);

		cmBoxfaculty = new JComboBox<String>(faculty);
		cmBoxfaculty.setBounds(110, 180, 200, 50);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(110, 270, 100, 50);
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				
				String gender = btnGroup.getSelection().getActionCommand();
				
				String faculty = cmBoxfaculty.getSelectedItem().toString();
				
				String result = "Name : "+firstName + " "+lastName + "\nGender : "+gender+"\nFaculty : "+faculty;
				
				resultArea.setText(result);
				
			}
		});
		
		
		
		resultArea = new JTextArea();
		resultArea.setBounds(350,5,400,300);
		
		add(resultArea);
		add(lblFirstName);
		add(txtFirstName);
		
		add(lblLastName);
		add(txtLastName);
		
		add(lblGender);
		add(btnMale);
		add(btnFemale);
		
		add(lblFaculty);
		add(cmBoxfaculty);
		
		add(btnSubmit);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new RegistrationForm();
	}

}
