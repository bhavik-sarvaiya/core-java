package com.collection.batch;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfArrayList {

	public static void main(String[] args) {
		String[] args1 = new String[5];
		args1[0] = "Hello";
		args1[1] = "World";
		args1[2] = "This";
		args1[3] = "is";
		args1[4] = "ArrayList";
		System.out.println("Array of Strings: " + String.join(", ", args1));

		// Creating an ArrayList of Strings
		ArrayList<String> names = new ArrayList<>();
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		names.add("Eve");
		names.add("Frank");
		names.add("Alice");

		// Displaying the ArrayList

		System.out.println("Names in the list:" + " " + names);

		names.set(0, "Zara"); // Changing the first element

		// using iterator to traverse the ArrayList
		System.out.println("Iterating through the names using Iterator:");
		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {
			System.out.println("Name: " + iterator.next());
		}

		// using for-each loop to traverse the ArrayList
		System.out.println("Iterating through the names using for-each loop:");
		for (String name : names) {
			System.out.println("Name: " + name);
		}

		// using for loop to traverse the ArrayList
		System.out.println("Iterating through the names using for loop:");
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Name: " + names.get(i));
		}

		// using lambda expression to traverse the ArrayList
		/*
		 * * (data) -> { code block // code to be executed if condition is true }
		 */
		System.out.println("Iterating through the names using lambda expression:");
		names.forEach(data -> {
			System.out.println("Name: " + data);
		});

		// using method reference to traverse the ArrayList
		System.out.println("Iterating through the names using method reference:");
		names.forEach(System.out::println);

		// using stream to traverse the ArrayList
		System.out.println("Iterating through the names using stream:");
		names.stream().forEach(System.out::println);

	}
}
