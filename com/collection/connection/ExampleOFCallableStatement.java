package com.collection.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

public class ExampleOFCallableStatement {
	public static void main(String a[]) {
		try {

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
					"admin@123");

			CallableStatement cs = con.prepareCall("call employee_db.insert_employee(?, ?, ?, ?)");
			cs.setString(1, "Denim");
			cs.setString(2, "zuric");
			cs.setString(3, "CH");
			cs.setString(4, "Devloper");

			cs.execute();

			System.out.println("inserted employee");

			CallableStatement cs1 = con.prepareCall("{ ? = call employee_db.add(?, ?) }");
			cs1.registerOutParameter(1, Types.INTEGER);
			cs1.setInt(2, 10);
			cs1.setInt(3, 20);

			cs1.execute();
			// get result
			int result = cs1.getInt(1);
			System.out.println("Result: " + result);

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
