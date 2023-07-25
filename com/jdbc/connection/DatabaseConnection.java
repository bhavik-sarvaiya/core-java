package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	public static void main(String args[]) {

		try {

			String emaiId = "test16@bb.com";
			String name = "test16";
			String password = "123456";

			int updateUserId = 15;
			int deleteUserId = 12;

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "admin@123");
			System.out.println("create a connection.");

			Statement statement1 = con.createStatement();
			int insertRecord = statement1
					.executeUpdate("INSERT INTO `user_info`" + ".`user` (`email_id`, `name`, `password`) " + "VALUES ('"
							+ emaiId + "', '" + name + "', '" + password + "')");

			System.out.println("===================insert record======================");
			System.out.println(insertRecord + " record inserted.");

			System.out.println("====================update record=====================");
			Statement statement2 = con.createStatement();
			int updateRecord = statement2.executeUpdate(
					"UPDATE `user_info`" + ".`user` SET `name` = 'Bhumika' WHERE (`id` = '" + updateUserId + "')");
			System.out.println(updateRecord + " record updated. and user id = " + updateUserId);

			System.out.println("====================update record=====================");
			Statement statement3 = con.createStatement();
			int deletedRecord = statement3
					.executeUpdate("Delete from `user_info`" + ".`user` WHERE (`id` = '" + deleteUserId + "')");
			System.out.println(deletedRecord + " record deleted. and user id = " + deleteUserId);

			System.out.println("====================user list=====================");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from user");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			}

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
