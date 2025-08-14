package com.collection.connection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ExampleOfMetadata {
	public static void main(String a[]) {
		try {

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
					"admin@123");

			System.out.println("----------------all data----------------");
			// select operation for all data
			PreparedStatement ps3 = con.prepareStatement("SELECT * FROM employee_db.employeee");

			ResultSet rs1 = ps3.executeQuery();

			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + ", " + rs1.getString(2) + ", " + rs1.getString(3) + ", "
						+ rs1.getString(4) + ", " + rs1.getString(5));

			}
			System.out.println("=============Result set Metadata==============");
			ResultSetMetaData rsm = rs1.getMetaData();
			System.out.println("cloumn count : " + rsm.getColumnCount());
			System.out.println("isAutoIncreemnt : " + rsm.isAutoIncrement(1));
			System.out.println("cloumn name : " + rsm.getColumnClassName(1));
			System.out.println("cloumn name : " + rsm.getColumnTypeName(1));

			System.out.println("=============Database Metadata==============");

			DatabaseMetaData dm = con.getMetaData();
			System.out.println("Product Name: " + dm.getDatabaseProductName());
			System.out.println("Product version : " + dm.getDatabaseMinorVersion());
			System.out.println(dm.getDatabaseMajorVersion());
			System.out.println(dm.getDatabaseProductVersion());
			System.out.println(dm.getDriverName());
			System.out.println(dm.getDriverVersion());
			System.out.println(dm.getMaxTableNameLength());
			System.out.println(dm.getMaxTablesInSelect());
			System.out.println(dm.getMaxColumnsInTable());

			System.out.println("===========image store in db============");
			PreparedStatement preparedStatement = con.prepareStatement(
					"INSERT INTO `employee_db`" + ".`user_image` (`name`, `image`) " + "VALUES (?,?)");
			preparedStatement.setString(1, "Motu-patlu");
			FileInputStream fileInputStream = new FileInputStream("D:\\motu.jpg");
			preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());

			int insertRecord = preparedStatement.executeUpdate();
			System.out.println(insertRecord + " record inserted");

			System.out.println("===========image retrive in db============");
			PreparedStatement ps = con.prepareStatement("select * from employee_db.user_image");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2));

				Blob blob = rs.getBlob(3);
				byte arr[] = blob.getBytes(1, (int) blob.length());// 1 means first image

				FileOutputStream fout = new FileOutputStream("d:\\img\\test-" + rs.getInt(1) + ".jpg");
				fout.write(arr);
			}

			// close
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
