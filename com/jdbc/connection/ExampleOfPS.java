package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExampleOfPS {
	public static void main(String args[]) {
		String emailId = "smart1@cc.com";
		String name = "smart1";
		String password = "123456";

		String updateName = "manish";
		int updateRecordId = 6;

		try {
			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "admin@123");

			PreparedStatement preparedStatement = con.prepareStatement(
					"INSERT INTO `user_info`" + ".`user` (`email_id`, `name`, `password`) " + "VALUES (?,?,?)");
			preparedStatement.setString(1, emailId);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, password);

			int insertRecord = preparedStatement.executeUpdate();
			System.out.println(insertRecord + " record inserted");
			System.out.println("======================================");

			PreparedStatement preparedStatement3 = con.prepareStatement("update user set name = ? where id = ?");
			preparedStatement3.setString(1, updateName);
			preparedStatement3.setInt(2, updateRecordId);
			int updateRecord = preparedStatement3.executeUpdate();

			System.out.println(updateRecord + " record updated and id = " + updateRecordId);

			System.out.println("======================================");

			PreparedStatement preparedStatement2 = con.prepareStatement("select * from user");
			ResultSet resultSet = preparedStatement2.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " | " + resultSet.getString("name") + " | "
						+ resultSet.getString(3) + " | " + resultSet.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
