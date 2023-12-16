package com.collection;

import java.util.Collections;
import java.util.LinkedList;

import com.collection.comparator.StudentComparable;

public class StudentSrodetdByAge {

	public static void main(String[] args) {
		LinkedList<StudentComparable> list = new LinkedList<StudentComparable>();
		list.add(new StudentComparable("Krunal", "1", 25));
		list.add(new StudentComparable("Harsh", "2", 27));
		list.add(new StudentComparable("Jigar", "3", 26));
		list.add(new StudentComparable("Chirag", "4", 23));

		Collections.sort(list);

		list.forEach(data -> System.out.println(data.getId() + " | " + data.getName() + " | " + data.getAge()));
	}

}
