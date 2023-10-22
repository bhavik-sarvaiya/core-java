package com.jdbc.connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExampleOfStoreImage {
	public static void main(String args[]) {
		try {
			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "admin@123");

			PreparedStatement preparedStatement = con.prepareStatement(
					"INSERT INTO `user_info`" + ".`user_image` (`name`, `image`) " + "VALUES (?,?)");
			preparedStatement.setString(1, "dhruv");
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\BHAVIK\\Downloads\\image.jpg");
			preparedStatement.setBinaryStream(2,fileInputStream,fileInputStream.available());

			int insertRecord = preparedStatement.executeUpdate();
			System.out.println(insertRecord + " record inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
