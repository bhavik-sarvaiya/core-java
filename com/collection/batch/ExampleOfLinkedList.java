package com.collection.batch;

import java.util.LinkedList;

public class ExampleOfLinkedList {

	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Manago");
		list.add("oranage");
		list.add("Chary");

		System.out.println("-------using method refernace and forEach method------");
		list.forEach(System.out::println);

		System.out.println("-------using for loop------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
