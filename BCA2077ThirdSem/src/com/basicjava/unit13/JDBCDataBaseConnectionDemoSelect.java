package com.basicjava.unit13;

import java.sql.*;

public class JDBCDataBaseConnectionDemoSelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bcathirdsem";
			String userName = "Admin";
			String password = "Admin";
			Connection con =  DriverManager.getConnection(url, userName, password);
			Statement stm = con.createStatement();
			
			String query = "select * from employee;";
			ResultSet rs =  stm.executeQuery(query);
			while(rs.next()) {
				int empid = rs.getInt("empid");
				String name = rs.getString("name");
				String phoneno = rs.getString("phoneno");
				
				System.out.println("ID : "+ empid+" Name : "+name + " PhoneNo : "+phoneno);
				
			}
			con.close();
			

		} catch (Exception e) {

		}

	}
}
