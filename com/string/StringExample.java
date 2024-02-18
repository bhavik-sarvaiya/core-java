package com.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import com.collection.model.Student;

public class StringExample {
	public static void main(String args[]) {
		String s1 = "HELLO";
		String s2 = new String("HELLO");
		String s3 = "HELLO";
		String x = s1.concat(s3);

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		StringBuffer sb = new StringBuffer("Hey Hello.... ");
		sb.insert(11, "Good Morning...");

		System.out.println("=========> " + sb);

		StringBuilder sbc = new StringBuilder("Hey There....");
		sbc.append("Hello.....");

		System.out.println("=========> " + sbc);
		System.out.println("=========> " + sbc.reverse());

		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student(1, "Krunal", 25));
		list.add(new Student(2, "Chirag", 23));
		list.add(new Student(3, "Harsh", 27));
		list.add(new Student(4, "Jigar", 26));

		Comparator<Student> ageComaparator = Comparator.comparing(Student::getName);

		System.out.println("After Apply Age Comaparator :- ");
		Collections.sort(list, ageComaparator);

		// foreach method
		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));

		System.out.println("=============================");
		// foreach loop
		for (Student st : list) {
			System.out.println(st.getName() + " | " + st.getAge() + " | " + st.getRollno());
		}

	}
}
