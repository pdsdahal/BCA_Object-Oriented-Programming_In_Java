package com.oopjava.unit13.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) {

		try {
			// loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/employeemgmt";
			String userName = "Admin";
			String password = "Admin";
			
			//create connection
			Connection  connection = DriverManager.getConnection(url, userName, password);
			
			//PreparedStatement
			String sql = "insert into employee (name, address) values (?,?)";
			
			PreparedStatement pstm =  connection.prepareStatement(sql);
			pstm.setString(1, "Sita Shrestha");
			pstm.setString(2, "Kathmandu Nepal");
			
			int result =  pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("Data Inserted Successfully!");
			}else {
				System.out.println("Failed to Insert!");
			}
			
			//close connection
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
