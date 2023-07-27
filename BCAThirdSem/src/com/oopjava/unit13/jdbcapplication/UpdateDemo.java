package com.oopjava.unit13.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

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
			String sql = "update employee set name=?, address=? where id=?";
			
			PreparedStatement pstm =  connection.prepareStatement(sql);
			pstm.setString(1, "Maya Shrestha");
			pstm.setString(2, "Bhaktapur Nepal");
			pstm.setInt(3, 6);
			
			
			int result =  pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("Data Updated Successfully!");
			}else {
				System.out.println("Failed to Update!");
			}
			
			//close connection
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
