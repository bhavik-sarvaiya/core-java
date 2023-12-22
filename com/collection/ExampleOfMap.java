package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOfMap {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Harsh");
		map.put(2, "Chirag");
		map.put(3, "Kinjal");
		map.put(4, "Janamjay");
		map.put(5, "Krunal");

		System.out.println("-----------Using foreach-------------");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key =>" + entry.getKey() + " , Value =>" + entry.getValue());
		}

		System.out.println("-----------Using Iterator-------------");

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
			// System.out.println("entry value ==> " + entry);
			System.out.println("Key =>" + entry.getKey() + " , Value =>" + entry.getValue());
		}
	}

}
