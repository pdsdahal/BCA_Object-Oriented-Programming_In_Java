package com.basicjava.unit13;

import java.sql.*;

public class JDBCDataBaseConnectionDemoInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bcathirdsem";
			String userName = "Admin";
			String password = "Admin";
			Connection con = DriverManager.getConnection(url, userName, password);

			String query = "insert into employee(name,phoneno) values (?,?);";

			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setString(1, "Shyam Dahal");
			pstm.setString(2, "345678");
			int rows = pstm.executeUpdate();
			
			
			if (rows >=1) {
				System.out.println("Data inserted...");
			} else {
				System.out.println("Failed to insert");
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
