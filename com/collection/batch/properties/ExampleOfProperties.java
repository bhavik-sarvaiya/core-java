package com.collection.batch.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map.Entry;
import java.util.Properties;

public class ExampleOfProperties {
	public static void main(String sr[]) {
		try {
			FileReader reader = new FileReader("db.properties");

			Properties properties = new Properties();
			properties.load(reader);

			System.out.println(properties.getProperty("user"));
			System.out.println(properties.getProperty("password"));

			System.out.println("=======list out the properties file value======");
			for (Entry val : properties.entrySet()) {
				System.out.println(val.getKey() + " = " + val.getValue());
			}

			// create new properties file

			properties.setProperty("java.version", "17");
			properties.setProperty("mysql.version", "8.0.1");
			properties.setProperty("mysql.driver", "msql");

			properties.store(new FileWriter("info.properties"), "java document for properties");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
