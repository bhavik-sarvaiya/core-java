package com.collection.batch;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleOfDqueue {
	public static void main(String args[]) {
		Deque<String> list = new ArrayDeque<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Chary");
		list.add("rose");

		list.forEach(System.out::println);

		System.out.println("peek => " + list.peek());

		System.out.println("peek first => " + list.peekFirst());
		System.out.println("remove => " + list.removeLast());
		System.out.println("peek last => " + list.peekLast());
	}

}
