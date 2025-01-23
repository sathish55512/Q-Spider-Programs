package com.jspiders.queryExecution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Static_Delete_type {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection conn = DriverManager.getConnection(dburl);
			String query = "DELETE FROM d_mart WHERE p_name = 'Brown_Sugar'";
			Statement stmt = conn.createStatement();
			int row = stmt.executeUpdate(query);
			System.out.println(row);
			conn.close();
			stmt.close();
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
}
