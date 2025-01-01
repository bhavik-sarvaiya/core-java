package com.example.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOfDbConnection {
	public static void main(String args[]) {

		try {

			String name = "test16";
			String roll_no = "123456";

			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin@123");
			System.out.println("create a connection.");

			// create statement
			Statement statement1 = con.createStatement();

			// execute query
			int insertRecord = statement1.executeUpdate(
					"INSERT INTO `demo`" + ".`student` (`name`, `roll_no`, `department_id`,`result`,`city_id`) "
							+ "VALUES ('" + name + "', '" + roll_no + "', '" + 1 + "', '" + 0 + "', '" + 2 + "')");

			System.out.println("===================insert record======================");
			System.out.println(insertRecord + " record inserted.");

			Statement statement2 = con.createStatement();

			// Update query
			int updateRecord = statement2
					.executeUpdate("UPDATE `demo`.`student` SET `department_id` = '2' WHERE (`id` = '1')");
			System.out.println("===================update record======================");
			System.out.println(updateRecord + " record updated.");
			
			Statement statement3 = con.createStatement();
			
			//delete query
			int deleteRecord = statement3
					.executeUpdate("DELETE FROM `demo`.`student` WHERE (`id` = '8')");
			System.out.println("===================delete record======================");
			System.out.println(deleteRecord + " record deleted.");
			

			System.out.println("====================user list=====================");

			// view list of recored
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from student");
					
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getInt(4));
			}
			
			System.out.println("====================result set metadata=====================");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("column count => " + rsmd.getColumnCount());
			System.out.println("table name => " + rsmd.getTableName(1));
			System.out.println("column name => " + rsmd.getColumnName(3));
			
			System.out.println("====================Database metadata=====================");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Driver name => " + dbmd.getDriverName());
			System.out.println("User name => " + dbmd.getUserName());
			System.out.println("Database product name => " + dbmd.getDatabaseProductName());
			System.out.println("Database product version => " + dbmd.getDatabaseProductVersion());
			//System.out.println("Database product version => " + dbmd.getTables(roll_no, roll_no, name, args));
			
			String table[]={"TABLE"};  
			ResultSet rs2=dbmd.getTables(null,null,null,table);  
			  
			while(rs2.next()){  
			System.out.println(rs2.getString(3));  
			} 
			// close connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
