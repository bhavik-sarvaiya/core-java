package com.collection.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleOfBatchProcessing {
	public static void main(String args[]) {
		try {
			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
					"admin@123");
			Statement st = con.createStatement();
			String name = "test";
			String city = "test";
			String address = "test";
			String designation = "Doctor";

			st.addBatch("INSERT INTO `employee_db`" + ".`employeee` (`name`, `city`, `address`, `designation`) "
					+ "VALUES ('" + name + "','" + city + "', '" + address + "','" + designation + "')");
			st.addBatch("INSERT INTO `employee_db`" + ".`employeee` (`name`, `city`, `address`, `designation`) "
					+ "VALUES ('" + name + "','" + city + "', '" + address + "','" + designation + "')");
			st.addBatch("INSERT INTO `employee_db`" + ".`employeee` (`name`, `city`, `address`, `designation`) "
					+ "VALUES ('" + name + "','" + city + "', '" + address + "','" + designation + "')");
			st.addBatch("INSERT INTO `employee_db`" + ".`employeee` (`name`, `city`, `address`, `designation`) "
					+ "VALUES ('" + name + "','" + city + "', '" + address + "','" + designation + "')");
			int[] val = st.executeBatch();

			System.out.println(val.length + "batch result");

			System.out.println("----------------all data----------------");
			// select operation for all data
			PreparedStatement ps = con.prepareStatement("select * from employee_db.employeee");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2));
			}

			// close
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
