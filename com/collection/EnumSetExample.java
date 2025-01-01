package com.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
	public static void main(String args[]) {
		Set<days> set = EnumSet.allOf(days.class);
		
		System.out.println(set);
		
		Set<days> set1 = EnumSet.noneOf(days.class);
		System.out.println(set1);
		
		Set<days> set2 = EnumSet.of(days.FRIDAY,days.MONDAY,days.valueOf("SATURDAY"));
		System.out.println(set2);
	}
}
