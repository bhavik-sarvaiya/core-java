package com.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class example15 {
	public static void main(String args[]) {
		Map map = new HashMap();
		map.put("1", "Bhavik");
		map.put("4", "Dhruv");
		map.put("3", "Bhumika");
		map.put("2", "Hiten");

		Set maplist = map.entrySet();

		Iterator itr = maplist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("===========for each========");
		map.entrySet().forEach(data -> {
			Map.Entry entry = (Entry) data;
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// System.out.println(entry.getKey());
			// System.out.println(entry.getValue());
		});

		System.out.println("========for ========");
		map.entrySet().forEach(System.out::println);

		System.out.println("========comparing by value ========");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}
}
