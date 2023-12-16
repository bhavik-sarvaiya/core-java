package com.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import com.collection.comparator.StundentAgeComparator;
import com.collection.comparator.StundentNameComparator;
import com.collection.comparator.StundentRollNumberComparator;
import com.collection.model.Student;

public class ExampleOfStudentComparatorUsingJAVA8 {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student(1, "Krunal", 25));
		list.add(new Student(2, "Chirag", 23));
		list.add(new Student(3, "Harsh", 27));
		list.add(new Student(4, "Jigar", 26));

		Comparator<Student> ageComaparator = Comparator.comparingInt(Student::getAge);

		System.out.println(" After Apply Age Comaparator :-");
		Collections.sort(list, ageComaparator);

		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));
		System.out.println(" After Apply roll Number Comaparator :-");
		Comparator<Student> rollNumber = Comparator.comparingInt(Student::getRollno);
		Collections.sort(list, rollNumber);
		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));

		System.out.println(" After Apply Name Comaparator :-");
		Comparator<Student> name = Comparator.comparing(Student::getName);
		Collections.sort(list, name);
		list.forEach(data -> System.out.println(data.getRollno() + " | " + data.getName() + " | " + data.getAge()));

		System.out.println(" After Apply reverse order method in collection :-");

		LinkedList<String> listrs = new LinkedList<String>();
		listrs.add("Krunal");
		listrs.add("Chirag");
		listrs.add("Harsh");
		listrs.add("Jigar");

		Collections.sort(listrs, Collections.reverseOrder());
		listrs.forEach(data -> System.out.println(data));
	}
}
