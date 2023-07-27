package com.oopjava.unit13.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) {

		try {
			// loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/employeemgmt";
			String userName = "Admin";
			String password = "Admin";
			
			//create connection
			Connection  connection = DriverManager.getConnection(url, userName, password);
			
			//create Statement
			String sql = "delete FROM employee where id = ?";
			
			PreparedStatement pstm =  connection.prepareStatement(sql);
			pstm.setString(1, "5");
			
			int result =  pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("Data Deleted Successfully!");
			}else {
				System.out.println("Failed to Delete!");
			}
			
			//close connection
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
