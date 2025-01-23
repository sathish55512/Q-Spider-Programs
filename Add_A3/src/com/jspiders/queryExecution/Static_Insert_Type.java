package com.jspiders.queryExecution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Static_Insert_Type {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
		Connection connection = DriverManager.getConnection(dburl);
		String query = "INSERT INTO d_mart(id,p_name,p_quantity,price,p_mfd,p_ed)"
				+"VALUES(5,'POHA','2.5','150','2023','2024')";
		Statement stmt = connection.createStatement();
		int row = stmt.executeUpdate(query);
		if(row > 0) {
			System.out.println("Insertion update done");
		}
		else {
			System.out.println("Insertions fails");
		}
		connection.close();
		stmt.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
