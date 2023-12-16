package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleOfLinkedHashset {
	public static void main(String a[]) {
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("Hash");
		list.add("Deepak");
		list.add("Jigar");
		list.add("Krunal");
		list.add("Chiarang");
		list.add("Deepak");

		System.out.println("===> using forEach method :- " + list.hashCode());
		// using for - each method

		list.forEach((data) -> {
			System.out.println(data.hashCode() + " = > " + data);
		});

		// using for loop
		System.out.println("===> using for loop :- " + list.hashCode());

		ArrayList<String> setList = new ArrayList<String>(list);

		for (int i = 0; i < setList.size(); i++) {
			System.out.println(setList.get(i));
		}

		// using Iterator
		System.out.println("===> using Iterator :- " + list.hashCode());
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		// using for each loop
		System.out.println("===> using for each loop :- " + list.hashCode());
		for (String val : list) {
			System.out.println(val);
		}

	}
}
