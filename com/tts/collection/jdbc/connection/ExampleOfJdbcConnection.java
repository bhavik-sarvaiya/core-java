package com.tts.collection.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleOfJdbcConnection {

	public static void main(String a[]) {

		try {
			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tts-batch", "root", "admin@123");

			// create statement
			Statement st = con.createStatement();

			// execute query
			ResultSet rs = st.executeQuery("select * from student where id=2");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}

			// close connection
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
