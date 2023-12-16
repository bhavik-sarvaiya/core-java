package com.collection;

import java.util.Collections;
import java.util.LinkedList;

import com.collection.comparator.StundentAgeComparator;
import com.collection.comparator.StundentNameComparator;
import com.collection.comparator.StundentRollNumberComparator;
import com.collection.model.Student;

public class ExampleOfStudentComparator {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student(1, "Krunal", 25));
		list.add(new Student(2, "Chirag", 23));
		list.add(new Student(3, "Harsh", 27));
		list.add(new Student(4, "Jigar", 26));

		System.out.println(" After Apply Name Comaparator :-");
		Collections.sort(list, new StundentNameComparator());

		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));

		System.out.println(" After Apply rollNumber Comaparator :-");
		Collections.sort(list, new StundentRollNumberComparator());

		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));

		System.out.println(" After Apply Age Comaparator :-");
		Collections.sort(list, new StundentAgeComparator());

		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));

	}
}
