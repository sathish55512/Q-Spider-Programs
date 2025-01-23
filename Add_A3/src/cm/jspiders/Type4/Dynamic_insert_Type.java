package cm.jspiders.Type4;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Dynamic_insert_Type {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Inputs For the Table d_mart");
		System.out.print("id : ");int id = in.nextInt();
		in.nextLine();
		System.out.print("\np_name : ");String name = in.next();
		System.out.print("\nprice : ");String price = in.next();
		System.out.print("\np_quantity : ");String quantity = in.next();
		System.out.print("\np_mfd : ");String mfd = in.next();
		System.out.print("\np_ed : ");String ed = in.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection conn = DriverManager.getConnection(dburl);
			String Query = "INSERT INTO d_mart(id,p_name,p_quantity,price,p_mfd,p_ed)"
					+"VALUES(?,?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(Query);
			psmt.setInt(1, id);
			psmt.setString(2,name);
			psmt.setString(3,price);
			psmt.setString(4,quantity);
			psmt.setString(5,mfd);
			psmt.setString(6,ed);
			
			int row = psmt.executeUpdate();
			if(row > 0) {
				System.out.println(row + " row affected");
			}
			else {
				System.out.println("insertion failed");
			}
			psmt.close();
			conn.close();
		}
		catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
}
