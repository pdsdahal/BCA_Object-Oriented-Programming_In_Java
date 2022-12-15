package com.basicjava.unit11;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JCompoentsDemo {

	public static void main(String[] args) {
		//JFrame
		JFrame frame = new JFrame();
		frame.setTitle("JComponents Demo");
		frame.setBounds(10, 10, 600, 700);
		frame.setLayout(null);
		
		//JLabel
		JLabel lblUserName = new JLabel("UserName : ");
		lblUserName.setBounds(10, 15, 100, 50);
		
		//JTextField
		JTextField  txtUserName = new JTextField();
		txtUserName.setBounds(110, 15, 200, 50);
		
		//JLabel
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(10, 70, 100, 50);
		
		//JPasswordField
		JPasswordField txtPassword = new JPasswordField();
		txtPassword.setBounds(110, 70, 200, 50);
		
		//JTextArea
		JTextArea txtDescription = new JTextArea();
		txtDescription.setBounds(10, 130, 200, 100);
		
		//JButton
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(10, 240, 200, 50);
		
		//JCheckBox
		JCheckBox chkLanguageNepali = new JCheckBox("Nepali");
		chkLanguageNepali.setBounds(10, 300, 100, 50);
		
		
		JCheckBox chkLanguageEnglish = new JCheckBox("English");
		chkLanguageEnglish.setBounds(130, 300, 220, 50);
		
		
		//JRadioButton
		JRadioButton btnMale = new JRadioButton("Male");
		btnMale.setBounds(10, 360, 100, 50);
		
		JRadioButton btnFeMale = new JRadioButton("FeMale");
		btnFeMale.setBounds(130, 360,220, 50);
		
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(btnMale);
		btnGroup.add(btnFeMale);
		
		//JComboBox
		String[] country = {"Nepal","India","China","Japan"};
		
		JComboBox<String> cmBox = new JComboBox<>(country);
		cmBox.setBounds(10, 420, 100, 50);
		
		//JTable
		String[][] row = {{"Ram Panday","1"},{"Shyam Panday","2"}};
		String[] column = {"Name","Id"};
		
		
		JTable table = new JTable(row, column);
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(10, 480, 300, 150);
		
		
		frame.add(lblUserName);
		frame.add(txtUserName);
		frame.add(lblPassword);
		frame.add(txtPassword);
		frame.add(txtDescription);
		frame.add(btnLogin);
		
		frame.add(chkLanguageEnglish);
		frame.add(chkLanguageNepali);
		frame.add(btnMale);
		frame.add(btnFeMale);
		frame.add(cmBox);
		frame.add(pane);
		
		//JOptionPane
		JOptionPane.showMessageDialog(frame, "Click ok");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
