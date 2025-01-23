package cm.jspiders.Type4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Dynamic_Delete_type {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection conn = DriverManager.getConnection(dburl);
			String query = "DELETE FROM d_mart WHERE p_name = ?";
			PreparedStatement psmt = conn.prepareStatement(query);
			Scanner in = new Scanner(System.in);
			psmt.setString(1,in.nextLine());
			int row = psmt.executeUpdate();
			System.out.println(row);
			conn.close();
			psmt.close();
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
}
