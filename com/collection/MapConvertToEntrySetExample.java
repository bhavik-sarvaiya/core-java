package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConvertToEntrySetExample {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Darren");
		map.put(2, "Deepak");
		map.put(3, "Bhavik");
		map.put(4, "Manish");
		map.put(5, "Manoj");

		System.out.println(map);

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();

			System.out.println(entry.getKey() + " => " + entry.getValue());

		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " ====> " + entry.getValue());
		}

		map.entrySet().forEach(x -> System.out.println(x.getKey() + " , " + x.getValue()));

	}

}
