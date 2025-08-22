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

			System.out.println("====================insert employee data =====================");
			Statement statement1 = con.createStatement();
			String name = "suni";
			String city = "surat";
			String address = "xyxvz";
			String designation = "accountant";

			int insertRecord = statement1.executeUpdate(
					"INSERT INTO `employee_db`" + ".`employeee` (`name`, `city`, `address`, `designation`) "
							+ "VALUES ('" + name +"','"+ city + "', '" + address + "','" + designation + "')");

			System.out.println(insertRecord + " record inserted");

			System.out.println("====================update employee data =====================");

			Statement statement2 = con.createStatement();

			int updatedRecord = statement2.executeUpdate("UPDATE `employee_db`.`employeee` SET `name` = 'sunay', "
					+ "`city` = 'vadodara', `address` = 'alkapuri' " + "WHERE (`id` = '6')");
			System.out.println(updatedRecord + " record updated");

			System.out.println("====================employee list=====================");
			// create statement
			Statement statement = con.createStatement();
			// execute query
			ResultSet rs = statement.executeQuery("select * from employeee where id = 1");

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
