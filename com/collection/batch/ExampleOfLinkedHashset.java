package com.collection.batch;

import java.util.*;

public class ExampleOfLinkedHashset {

	public static void main(String args[]) {
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("Manago");
		list.add("Oranage");
		list.add("banana");

		list.forEach(System.out::println);
		System.out.println("-----------------");

		// --> find solution
		list.stream().filter(data -> data.equals("Manago")).findAny();
	}

}
