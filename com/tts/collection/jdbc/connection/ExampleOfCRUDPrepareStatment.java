package com.tts.collection.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ExampleOfCRUDPrepareStatment {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tts-batch", "root", "admin@123");

			// create statement
			PreparedStatement ps = con.prepareStatement("select * from student");

			// execute query;
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}

			/*
			 * insert record
			 */

			System.out.println("If you want to insert record ? true/false");
			Boolean insertData = sc.nextBoolean();

			if (insertData) {
				System.out.println("Please enter the Name :");
				String name = sc.next();
				System.out.println("Please enter the Age :");
				String age = sc.next();
				System.out.println("Please enter the City :");
				String city = sc.next();
				System.out.println("Please enter the Roll No :");
				String rollNo = sc.next();

				ps = con.prepareStatement("INSERT INTO `tts-batch`.`student`" + " VALUES(?,?, ?, ?, ?)");
				ps.setInt(1, 0);
				ps.setString(2, name);
				ps.setString(3, age);
				ps.setString(4, city);
				ps.setString(5, rollNo);

				int insertRecord = ps.executeUpdate();

				ps = con.prepareStatement("select * from student");
				rs = ps.executeQuery();

				System.out.println("inserted " + insertRecord + " record");

				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
				}
			}

			/*
			 * upadte record
			 */

			System.out.println("If you want to Update record ? true/false");
			Boolean updateData = sc.nextBoolean();

			if (updateData) {
				System.out.println("Please enter the Id :");
				Integer id = sc.nextInt();

				if (0 != id || null != id) {

					ps = con.prepareStatement("select * from student where id = ?");
					ps.setInt(1, id);
					rs = ps.executeQuery();

					System.out.println("Please enter the Name or skip this prees 'n' :");
					String name = sc.next();
					System.out.println("Please enter the Age or skip this prees 'n' :");
					String age = sc.next();
					System.out.println("Please enter the City or skip this prees 'n' :");
					String city = sc.next();
					System.out.println("Please enter the Roll No or skip this prees 'n':");
					String rollNo = sc.next();

					ps = con.prepareStatement(
							"update `tts-batch`.`student` set name = ?, age = ?, city = ?, roll_no = ?"
									+ "where id = ?");

					ps.setString(1, "n" != name ? name : rs.getString(2));
					ps.setInt(2, "n" != age ? Integer.valueOf(age) : rs.getInt(3));
					ps.setString(3, "n" != city ? city : rs.getString(4));
					ps.setString(4, "n" != rollNo ? rollNo : rs.getString(5));
					ps.setInt(5, id);
					int updateRecord = ps.executeUpdate();

					ps = con.prepareStatement("select * from student");
					rs = ps.executeQuery();

					System.out.println("Updated " + updateRecord + " record");

					while (rs.next()) {
						System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", "
								+ rs.getString(4));
					}
				} else {
					System.out.println("Id is mandatory for update the record.");
				}
			}

			// close connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
