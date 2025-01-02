package com.tts.collection.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleOfCRUDUsingStatement {
	public static void main(String a[]) {

		try {
			// register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tts-batch", "root", "admin@123");

			// create statement
			Statement st = con.createStatement();

			// execute query;
			ResultSet rs = st.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}

			/*
			 * insert record
			 */
			System.out.println("==== after insert record ===");

			int record = st.executeUpdate("INSERT INTO `tts-batch`.`student`"
					+ " (`name`, `age`, `city`, `roll_no`) VALUES" + " ('manish234', '27', 'Bharuch', 'A007')");

			System.out.println("inserted " + record + " record");

			rs = st.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}

			/*
			 * update record
			 */
			System.out.println("==== after update record ===");

			int updateRecord = st.executeUpdate("UPDATE `tts-batch`.`student` SET `age` = '30' WHERE (`id` = '8');");

			System.out.println("updated " + updateRecord + " record");

			rs = st.executeQuery("select * from student where id = 3");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}

			/*
			 * delete record
			 */
			System.out.println("==== after delete record ===");

			int deleteRecord = st.executeUpdate("DELETE from student WHERE id = 3");

			System.out.println("deleted " + deleteRecord + " record");

			rs = st.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}

			// close connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
