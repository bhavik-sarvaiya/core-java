package com.collection.batch;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleOfArrayListSorting {
	public static void main(String a[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("jay");
		list.add("Surabh");
		list.add("bhavik");
		list.add("sneha");
		list.add("Hiren");

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("jayeshbhai");
		list1.add("Surabhbhai");
		list1.add("bhavikbhai");
		list1.add("snehaben");
		list1.add("Hirenbhai");

		Collections.sort(list);

		list.addAll(list1);

		System.out.println("------add All method list-------");
		list.forEach(System.out::println);

		list.removeAll(list1);
		System.out.println("------remove All method list-------");
		list.forEach(System.out::println);

	}

}
