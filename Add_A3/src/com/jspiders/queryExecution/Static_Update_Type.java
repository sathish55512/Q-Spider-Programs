package com.jspiders.queryExecution;
import java.sql.*;
public class Static_Update_Type {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection connection = DriverManager.getConnection(dburl);
			String query = "UPDATE d_mart SET p_name = 'Brown_Sugar' WHERE id = 2 ";
			Statement stmt = connection.createStatement();
			int row = stmt.executeUpdate(query);
			if(row > 0) {
				System.out.println("Updation done");
			}
			else {
				System.out.println("Updation Unsucessfull");
			}
			connection.close();
			stmt.close();
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
}
