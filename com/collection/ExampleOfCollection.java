package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOfCollection {

	public static void main(String[] x) {
		List<String> list = new ArrayList();
		list.add("Aman");
		list.add("chirag");
		list.add("kinjal");
		list.add("krunal");
		list.add("Harsh");
		list.add("JJ");

		/*
		 * (expression) -> { body };
		 *
		 */
		System.out.println("using lemabda expression :");
		list.forEach((val) -> {
			System.out.println("=> " + val);
		});

		System.out.println("using for each :");
		// for loop
		for (String val : list) {
			System.out.println("=> " + val);
		}

		System.out.println("using for loop :");
		// for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("=> " + list.get(i));
		}

		System.out.println("using for Iterator :");
		// Iterator
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println("=> " + itr.next());

		}
//		Iterator itr1 = list.iterator();
//		itr1.remove();
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}

	}
}
