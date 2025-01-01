package com.tts.collection.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String args[]) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Krunal");
		map.put("3", "Mehul");
		map.put("2", "Surabh");
		map.put("5", "Hiren");
		map.put("4", "Mayur");

		Set<Entry<String, String>> set = map.entrySet();

		Iterator<?> itr = set.iterator();

		while (itr.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());

		}

		System.out.println(map.entrySet().stream().findFirst().get());
		;

		map.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		// .forEach(data -> System.out.println(data));

	}

}
