package com.collection.batch;

import java.util.HashMap;
import java.util.Map;

import com.collection.batch.enumset.Days;

public class ExampleOfEnumMap {
	public static void main(String at[]) {
		Map<Days, Integer> map = new HashMap<Days, Integer>();
		map.put(Days.SUNDAY, 1);
		map.put(Days.MONDAY, 2);
		map.put(Days.TUESDAY, 3);

		for (Map.Entry<Days, Integer> val : map.entrySet()) {
			System.out.println(val.getKey() + " , " + val.getValue());
		}
	}

}
