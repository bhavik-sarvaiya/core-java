package com.collection;

import java.util.HashSet;

public class ExampleOfHashSet {
	public static void main(String a[]) {
		HashSet<String> list = new HashSet<String>();
		list.add("Hash");
		list.add("Deepak");
		list.add("Jigar");
		list.add("Krunal");
		list.add("Chiarang");
		list.add("Deepak");
		//list.add(null);
		
		System.out.println("===> list :- "+list.hashCode());
		
		list.forEach((data) -> {
			System.out.println(data.hashCode()+" = > "+ data);
			});	
		

	}
}
