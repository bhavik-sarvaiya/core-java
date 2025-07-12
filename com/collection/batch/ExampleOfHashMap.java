package com.collection.batch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOfHashMap {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Orange");
		map.put(2, "Mango");
		map.put(3, "Apple");
		map.put(4, "Charry");
		map.put(5, "banana");

		System.out.println(map);

		Set list = map.entrySet();
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> val = (Entry<Integer, String>) itr.next();
			System.out.println(val.getKey() + "," + val.getValue());
		}

		System.out.println("--------use for each loop--------");
		for (Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + " ==> " + data.getValue());
		}

		System.out.println("--------print key--------");
		map.entrySet().forEach(data -> {
			System.out.println("key = " + data.getKey());
		});

		System.out.println("--------print value--------");
		map.entrySet().forEach(data -> {
			System.out.println("value = " + data.getValue());
		});

		System.out.println("using key print value " + map.get(2));
		System.out.println("using key remove value " + map.remove(2));

		map.entrySet().forEach(data -> {
			System.out.println(data.getKey() + " => " + data.getValue());
		});

		System.out.println("using value check value contain in map or not:" + map.containsValue("banana"));

	}

}
