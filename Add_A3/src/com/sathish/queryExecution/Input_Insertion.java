package com.sathish.queryExecution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
public class Input_Insertion {
	public static void main(String[] args) {
		try{
			//Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Sucessfully");
			
			//Establish Connection
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection conn = DriverManager.getConnection(dburl);
			if(conn!=null){
				System.out.println("Connection Established Sucessfully");
			}
			else {
				System.out.println("Connection Fails");
				return;
			}
			
			//Issue Query
			Scanner in = new Scanner(System.in);
			String query = "INSERT INTO d_mart(id,p_name,price,p_quantity,p_mfd,p_ed)VAlUES";
			while(true){
				System.out.println("Enter The Inputs For the Table d_mart");
				System.out.print("id : ");String id = in.next();
				System.out.print("\np_name : ");String name = in.nextLine();
				System.out.print("\nprice : ");String price = in.next();
				System.out.print("\np_quantity : ");String quantity = in.next();
				System.out.print("\np_mfd : ");String mfd = in.next();
				System.out.print("\np_ed : ");String ed = in.next();
				
				query += "("+id+",'"+name+"','"+price+"','"+quantity+"','"+mfd+"','"+ed+"')";
				
				System.out.println("\nPress 1 Push Input\nPress 2 for more Inputs");
				int val = in.nextInt();
				if(val == 1) {
					System.out.println(query);
					break;
				}
				else {
					query +=",";
					System.out.println(query);
				}
			}
			Statement stmt = conn.createStatement();
			int row = stmt.executeUpdate(query);
			if(row > 0) {
				System.out.println(row + " Rows Affected");
			}
			else {
				System.out.println("Execution failed");
			}
			conn.close();
			stmt.close();
			
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
