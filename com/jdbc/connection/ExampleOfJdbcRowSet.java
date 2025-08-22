package com.jdbc.connection;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import com.jdbc.connection.listener.MyListener;

public class ExampleOfJdbcRowSet {
	public static void main(String a[]) {
		try {
			// Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// connection created
			JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
			jrs.setUrl("jdbc:mysql://localhost:3306/employee_db");
			jrs.setUsername("root");
			jrs.setPassword("admin@123");

			jrs.setCommand("select * from employee_db.employeee");

			jrs.execute();

			jrs.addRowSetListener(new MyListener());

			while (jrs.next()) {
				System.out.println(
						jrs.getInt(1) + "," + jrs.getString(2) + "," + jrs.getString(3) + "," + jrs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
