package com.collection.batch;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.batch.enumset.Days;

public class ExampleOfEnumSet {

	public static void main(String args[]) {
		Set<Days> set = EnumSet.of(Days.FRIDAY, Days.MONDAY, Days.SUNDAY);

		Iterator<Days> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
