package com.collection.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExampleOfPrepareSatament {
	public static void main(String args[]) {

		try {

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
					"admin@123");

			// insert operation
			PreparedStatement ps2 = con.prepareStatement(
					"insert into employee_db.employeee(name,city,address,designation)VALUES(?,?,?,?)");
			ps2.setString(1, "Mahesh");
			ps2.setString(2, "jamanagar");
			ps2.setString(3, "alkapuri");
			ps2.setString(4, "Doctor");

			int inserted = ps2.executeUpdate();

			System.out.println(inserted + " recored is inserted");

			// update operation
			PreparedStatement ps1 = con
					.prepareStatement("update employee_db.employeee set designation = ? where id = ?");
			ps1.setString(1, "engineer");
			ps1.setInt(2, 2);

			int updated = ps1.executeUpdate();
			System.out.println(updated + " record is updated.");

			// select operation
			PreparedStatement ps = con.prepareStatement("SELECT * FROM employee_db.employeee where id = ?");
			ps.setInt(1, 2);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", "
						+ rs.getString(4) + ", " + rs.getString(5));

			}

			System.out.println("----------------all data----------------");
			// select operation for all data
			PreparedStatement ps3 = con.prepareStatement("SELECT * FROM employee_db.employeee");

			ResultSet rs1 = ps3.executeQuery();

			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + ", " + rs1.getString(2) + ", " + rs1.getString(3) + ", "
						+ rs1.getString(4) + ", " + rs1.getString(5));

			}

			// close
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
