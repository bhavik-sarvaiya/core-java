package com.collection.batch;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ExampleOfTreeSet {
	public static void main(String args[]) {
		TreeSet<String> list = new TreeSet<String>();
		list.add("Manago");
		list.add("Orange");
		list.add("Apple");

		// print the contain value using stream api
		list.stream().filter(data -> data.contains("Manago")).forEach(System.out::println);

		// set the contain value using stream api
		Set<String> value = list.stream().filter(data -> data.contains("Manago")).collect(Collectors.toSet());

		System.out.println(value);

	}

}
