package com.tts.collection.demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String a[]) {
		Map<String, String> map = new TreeMap<String, String>();
		// map.put(null, null);
		map.put("1", "meehul");
		map.put("2", "krunal");
		map.put("3", "tarun");
		map.put("3", null);
		map.put("4", null);

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());
		}
	}
}
