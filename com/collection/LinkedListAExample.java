package com.collection;

import java.util.LinkedList;

public class LinkedListAExample {
	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add("ravi");
		list.add("mahesh");
		list.add("jaimin");
		list.add("hitesh");
		list.add("Ronak");

		System.out.println(list.contains("Ronak"));

		list.removeFirst();
		list.remove(2);
		list.forEach(x -> System.out.println(x));
	}
}
