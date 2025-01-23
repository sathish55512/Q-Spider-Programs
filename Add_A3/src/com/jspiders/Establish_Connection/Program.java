package com.jspiders.Establish_Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/add_a3?user=root&password=root";
			Connection connection = DriverManager.getConnection(dburl);
			if(connection !=null) {
				System.out.println("Connection Established Sucessfully");
			}
			else {
				System.out.println("Connection Fails");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}


/*	important questions in establish connection in jdbc API
 * 	Q1: how to establish connection in jdbc API
 * 	Q2: how to invoke getConection() Method
 * 	Q3: role of getConnection() method
 * 	Q4: Explain Connection interface in jdbc api
 * 	Q5: explain dburl with the structure
 *  Q6: why name of the host is local host instead of ip addrress
 *  Q7: port number of an my sql
 */

/*important questions in step 4 : create statement in jdbc
 * Q1: why we need to create statementl
 * Q2: Explain Statement interface
 * Q3: Explain prepared statement interface
 * Q4: Explain Callable statement interface
 * Q5: explain about factory methods
 * Q6: role of createStatement() methods
 * Q7: role of prepareStatement() method
 * Q8: role of prepareCall(String query) method
 */

/*Important questions in step 5 : execute query
 * why we need to execute queries in jdbc
 * how to execute queries in jdbc api
 * list out the helper methods
 * what is the role of execute(),excuteQuery(),executeUpdate()
 * what is the return type of execute(),excuteQuery(),executeUpdate()
 */
