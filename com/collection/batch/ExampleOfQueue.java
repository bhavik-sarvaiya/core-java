package com.collection.batch;

import java.util.PriorityQueue;

public class ExampleOfQueue {
	public static void main(String a[]) {
		PriorityQueue<String> list = new PriorityQueue<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Chiku");
		list.add("Apple");

		list.forEach(System.out::println);

		list.poll();
		list.poll();
		System.out.print("------------------- \n");
		list.forEach(System.out::println);

		System.out.println("--- peek method ---\n" + list.peek());

	}
}
