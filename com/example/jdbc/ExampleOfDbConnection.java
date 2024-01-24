package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOfDbConnection {
	public static void main(String args[]) {

		try {

			String name = "test16";
			String roll_no = "123456";

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin@123");
			System.out.println("create a connection.");

			// create statement
			Statement statement1 = con.createStatement();

			// execute query
			int insertRecord = statement1.executeUpdate(
					"INSERT INTO `demo`" + ".`student` (`name`, `roll_no`, `department_id`,`result`,`city_id`) "
							+ "VALUES ('" + name + "', '" + roll_no + "', '" + 1 + "', '" + 0 + "', '" + 2 + "')");

			System.out.println("===================insert record======================");
			System.out.println(insertRecord + " record inserted.");

			System.out.println("====================user list=====================");

			// view list of recored
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getInt(4));
			}

			// close connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
