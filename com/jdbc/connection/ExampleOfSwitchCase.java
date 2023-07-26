package com.jdbc.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ExampleOfSwitchCase {
	public static void main(String args[]) {

		try {
			String emailId;
			String name;
			String password;
			Integer id;
			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "admin@123");

			do {
				System.out.println("please select operation : \n1. insert record\n" + "2. update record \n"
						+ "3. display record \n" + "4. delete record");

				Scanner scanner = new Scanner(System.in);
				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Enter the email id :");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					emailId = br.readLine();
					System.out.println("Enter the name :");
					br = new BufferedReader(new InputStreamReader(System.in));
					name = br.readLine();
					System.out.println("Enter the password :");
					br = new BufferedReader(new InputStreamReader(System.in));
					password = br.readLine();
					PreparedStatement preparedStatement = con.prepareStatement(
							"INSERT INTO `user_info`" + ".`user` (`email_id`, `name`, `password`) " + "VALUES (?,?,?)");
					preparedStatement.setString(1, emailId);
					preparedStatement.setString(2, name);
					preparedStatement.setString(3, password);

					int insertRecord = preparedStatement.executeUpdate();
					System.out.println(insertRecord + " record inserted");
					break;
				case 2:
					System.out.println("Enter the id :");
					br = new BufferedReader(new InputStreamReader(System.in));
					id = Integer.parseInt(br.readLine());
					System.out.println("Enter the name :");
					br = new BufferedReader(new InputStreamReader(System.in));
					name = br.readLine();
					PreparedStatement preparedStatement3 = con
							.prepareStatement("update user set name = ? where id = ?");
					preparedStatement3.setString(1, name);
					preparedStatement3.setInt(2, id);
					int updateRecord = preparedStatement3.executeUpdate();

					System.out.println(updateRecord + " record updated and id = " + id);
					break;
				case 3:
					System.out.println("========================================================");
					PreparedStatement preparedStatement2 = con.prepareStatement("select * from user");
					ResultSet resultSet = preparedStatement2.executeQuery();

					ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
					System.out.println(rsmd.getColumnCount());
					System.out.println(rsmd.getTableName(1));

					while (resultSet.next()) {
						System.out.println(resultSet.getInt(1) + " | " + resultSet.getString("email_id") + " | "
								+ resultSet.getString(3) + " | " + resultSet.getString(4));
					}
					break;
				case 4:
					System.out.println("exit");
					break;
				}
				System.out.println("If you want to countinue y/n ?");
				String s = scanner.next();
				if (s.startsWith("n")) {
					break;
				}
			} while (true);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
