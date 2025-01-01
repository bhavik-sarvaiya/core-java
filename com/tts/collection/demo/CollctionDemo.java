package com.tts.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class CollctionDemo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mehul");
		list.add("Surabh");
		list.add("Jayesh");
		list.add("Tarun");
		list.add("mahesh");

		System.out.println(" list" + list);

		System.out.println("======= using the iterator =======");
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String val = itr.next();
			System.out.println("value =" + val);

		}

		System.out.println("======= using the for loop =======");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("======= for each =======");
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("======= for each method =======");
		list.forEach(data -> System.out.println(data));
	}
}
