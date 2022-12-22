package com.basicjava.unit13;

import java.sql.*;

public class JDBCDataBaseConnectionDemoDelete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bcathirdsem";
			String userName = "Admin";
			String password = "Admin";
			Connection con = DriverManager.getConnection(url, userName, password);

			String query = "delete from employee where empid=?";

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, 1);

			int rows = pstm.executeUpdate();
			
			if (rows >=1) {
				System.out.println("Data Deleted...");
			} else {
				System.out.println("Failed to Delete...");
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
