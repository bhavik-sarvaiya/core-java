package com.collection.batch;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ExampleOfLinkedHashMap {

	public static void main(String args[]) {

		/*
		 * example of == V/s .equals()
		 */
		String s1 = "Hello";
		String s2 = "Hello";

		String s3 = new String("Hello");

		System.out.println("s1 == s2 => " + (s1 == s2));
		System.out.println("s1 == s3 => " + (s1 == s3));
		System.out.println("s1.equals(s3) =>" + (s1.equals(s3)));

		LinkedHashMap<Integer, String> list = new LinkedHashMap<Integer, String>();
		list.put(1, "Mango");
		list.put(2, "Orange");
		list.put(3, "Chiku");
		list.put(4, "Charry");
		list.put(5, "Apple");

		// using forEach method
		for (Entry<Integer, String> map : list.entrySet()) {
			System.out.println(map.getKey() + "," + map.getValue());
		}

		// using forEach method with method reference
		list.entrySet().forEach(System.out::print);

		// using forEach method with lambda expression
		list.entrySet().forEach(data -> {
			System.out.println(data.getKey() + " , " + data.getValue());
		});
	}
}
