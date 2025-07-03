package com.collection.batch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleOfList {
	public static void main(String a[]) {
		List<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("ornage");
		list.add("apple");

		List<String> city = new LinkedList<String>();
		city.add("vadodara");
		city.add("surat");

		list.forEach(System.out::println);
		System.out.println("=========");
		city.forEach(System.out::println);
	}

}
