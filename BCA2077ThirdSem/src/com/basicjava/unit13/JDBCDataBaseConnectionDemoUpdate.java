package com.basicjava.unit13;

import java.sql.*;

public class JDBCDataBaseConnectionDemoUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bcathirdsem";
			String userName = "Admin";
			String password = "Admin";
			Connection con = DriverManager.getConnection(url, userName, password);

			String query = "update employee set name=?, phoneno=? where empid=?";

			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setString(1, "Gopal Dahal");
			pstm.setString(2, "345678");
			pstm.setInt(3, 1);
			int rows = pstm.executeUpdate();
			
			
			if (rows >=1) {
				System.out.println("Data Updated...");
			} else {
				System.out.println("Failed to Update");
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
