package cm.jspiders.Type4;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Dynamic_Update_Type {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection conn = DriverManager.getConnection(dburl);
			String query = "UPDATE d_mart SET p_name = ? WHERE id = ?";
			PreparedStatement psmt = conn.prepareStatement(query);
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the ID of the changing Value");
			psmt.setInt(3, in.nextInt());
			System.out.println("Enter the new product name");
			in.nextLine();
			psmt.setString(2,in.nextLine());
			if(psmt.executeUpdate()>0) {
				System.out.println("1 row affected");
			}
			else {
				System.out.println("No rows Affected");
			}
			psmt.close();
			conn.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
