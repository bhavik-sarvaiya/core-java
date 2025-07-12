package com.collection.batch;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExampleOfTreeMap {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "vadodara");
		map.put(3, "surat");
		map.put(2, "ahmedabad");
		map.put(4, "vapi");

		for (Entry<Integer, String> val : map.entrySet()) {
			System.out.println(val.getValue() + " , " + val.getKey());
		}
		System.out.println("-------------------------");
		SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>(map);

		sortedMap.entrySet().forEach(val -> {
			System.out.println(val.getValue() + " , " + val.getKey());
		});

		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + map.headMap(4));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(3));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(2, 3));

	}

}
