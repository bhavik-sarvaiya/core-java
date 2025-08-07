package com.collection.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleOfDatabaseConnnection {

	public static void main(String args[]) {

		try {

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
					"admin@123");
			System.out.println("create a connection.");

			System.out.println("====================employee list=====================");
			// create statement
			Statement statement = con.createStatement();
			// execute query
			ResultSet rs = statement.executeQuery("select * from employeee");

			// read list
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - "
						+ rs.getString(4) + " - " + rs.getString(5));
			}

			// close
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
