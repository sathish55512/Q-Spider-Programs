// Program to understand how to Load Driver in JDBC API
package com.jspiders.Loading_Driver;

public class Program {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// verify whether done or not
		System.out.println("Loading Driver Done Sucessfully");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
/* loading driver dome successfully by invoking "Class.forName()method"
  important questions from
  step1: loading driver in JDBC
    Q1: what is driver
        Driver is an Additional Software component of an JDBC API given By database vendors
    Q2: Explain driver manager class
    	it is an additional component of JDBC API which acts like interface b/w user and driver
    Q3: what is the role of Class.forName() Method
    	create instance of an driver with driver manager class
    Q4: how to load driver in JDBC API
    	we can load driver in JDBC API by invoking "Class.forName() method
    Q5: Mention the name of Mysql Driver / Mysql Driver Class
    	com.mysql.cj.jdbc.Driver
    Q6: explain .jar file
    	jar file are used to transfer java application from one to another
*/