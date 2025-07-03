package com.collection.batch;

import java.util.HashSet;

public class ExampleOfHashSet {
	public static void main(String a[]) {
		HashSet<String> list = new HashSet<String>();
		list.add("mango");
		list.add("orange");
		list.add("apple");
		list.add("mnago-1");

		list.forEach(System.out::println);

		for (String val : list) {
			System.out.println("value = " + val + " hashcode " + val.hashCode());

		}

	}

}
