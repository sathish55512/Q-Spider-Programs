package com.jspiders.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;

public class CRUD {
	static Scanner in = new Scanner(System.in);

	public static void insert() {
		System.out.print("Id : ");
		int Id = in.nextInt();
		System.out.print("Name : ");
		String name = in.next();
		System.out.print("Price : ");
		String price = in.next();
		System.out.print("Quantity : ");
		String qty = in.next();
		System.out.print("MFD : ");
		String mfd = in.next();
		System.out.print("EXD : ");
		String ed = in.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection conn = DriverManager.getConnection(dburl);
			String querry = "INSERT INTO d_mart(id,p_name,p_quantity,price,p_mfd,p_ed) VALUES(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(querry);
			pstmt.setInt(1, Id);
			pstmt.setString(2, name);
			pstmt.setString(3, qty);
			pstmt.setString(4, price);
			pstmt.setString(5, mfd);
			pstmt.setString(6, ed);
			int row = pstmt.executeUpdate();
			System.out.println(row + "row Affected");
			conn.close();
			pstmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update() {
		while (true) {
			System.out.println("Choose the option to Update\n1:Name\n2:Price\n3:Quantity\n4:MFD\n5:ED");
			int choice = in.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
				Connection conn = DriverManager.getConnection(dburl);
				String querry;
				String change;
				System.out.print("Enter ID : ");
				int id = in.nextInt();
				if (choice == 1) {
					querry = "UPDATE d_mart SET p_name = ? WHERE id = ?";
					System.out.print("\nEnter the New Name : ");
					change = in.next();
					System.out.println();
				} else if (choice == 2) {
					querry = "UPDATE d_mart SET price = ? WHERE id = ?";
					System.out.print("\nEnter the New Price : ");
					change = in.next();
					System.out.println();
				} else if (choice == 3) {
					querry = "UPDATE d_mart SET p_quantity = ? WHERE id = ?";
					System.out.print("\nEnter the New Quantity : ");
					change = in.next();
					System.out.println();
				} else if (choice == 4) {
					querry = "UPDATE d_mart SET p_mfd = ? WHERE id = ?";
					System.out.print("\nEnter the New MFD : ");
					change = in.next();
					System.out.println();
				} else if (choice == 5) {
					querry = "UPDATE d_mart SET p_ed = ? WHERE id = ?";
					System.out.print("Enter the New ED : ");
					change = in.next();
					System.out.println();
				} else {
					System.out.println("Invalid Choice");
					continue;
				}
				PreparedStatement stmt = conn.prepareStatement(querry);
				stmt.setString(1, change);
				stmt.setInt(2, id);
				int row = stmt.executeUpdate();
				System.out.println(row + "rows Affected");
				conn.close();
				stmt.close();
				break;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void delete() {
		while (true) {
			System.out.println("To Delete Whole Table Press 1\nDelete Specific Row Press 2");
			int choice = in.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
				Connection conn = DriverManager.getConnection(dburl);
				String querry;
				if (choice == 1) {
					querry = "DELETE FROM d_mart";
				} else if (choice == 2) {
					System.out.print("Enter ID : ");
					int id = in.nextInt();
					querry = "DELETE FROM d_mart WHERE id = " + id;
				} else {
					System.out.println("Invalid Choice");
					continue;
				}
				Statement stmt = conn.createStatement();
				int row = stmt.executeUpdate(querry);
				System.out.println(row + "rows Affected");
				conn.close();
				stmt.close();
				break;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void find() {
		while (true) {
			System.out.println("To Display Whole Table Press 1\nFind Specific Row Press 2");
			int choice = in.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
				Connection conn = DriverManager.getConnection(dburl);
				String querry;
				ResultSet rs;
				if (choice == 1) {
					querry = "SELECT * FROM d_mart";
				} else if (choice == 2) {
					System.out.print("Enter ID : ");
					int id = in.nextInt();
					querry = "SELECT * FROM d_mart WHERE id = " + id;
				} else {
					System.out.println("Invalid Choice");
					continue;
				}
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery(querry);
				System.out.println("ID\t\tNAME\t\tQTY\t\tPRICE\t\tMFD\t\tED");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t\t");
					for (int i = 2; i <= 6; i++) {
						System.out.print(rs.getString(i) + "\t\t");
					}
					System.out.println();
					System.out.println(
							"--------------------------------------------------------------------------------------");
				}
				conn.close();
				stmt.close();
				break;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
