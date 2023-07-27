package com.oopjava.unit13.jdbcapplication;

import java.sql.*;

public class SelectDemo {

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
			Statement statement =  connection.createStatement();
			
			//execute Statement
			String sql = "SELECT * FROM employee;";
			
			ResultSet rs = statement.executeQuery(sql);
			//fetch data
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				System.out.println("id : "+id + " , Name : "+name + ", Address : "+address);
			}
			
			//close connection
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
