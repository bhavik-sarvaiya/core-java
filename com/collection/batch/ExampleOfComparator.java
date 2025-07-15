package com.collection.batch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.collection.batch.comparator.CityComparator;
import com.collection.batch.model.Student;

public class ExampleOfComparator {

	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("1", "sneha", 25, "vadodara", "A"));
		list.add(new Student("2", "surabha", 35, "surat", "B"));
		list.add(new Student("3", "bhavin", 16, "surat", "B"));
		list.add(new Student("4", "manish", 25, "ahmedabad", "A"));

		// sort data using .comparing method
		Comparator<Student> sirtedByDiv = Comparator.comparing(Student::getAge);
		Collections.sort(list, sirtedByDiv);
		list.forEach(data -> {
			System.out.println(data.getId() + "," + data.getAge() + "," + data.getName() + "," + data.getCity() + " , "
					+ data.getDiv());
		});

		System.out.println("------------------");

		// sort data using using Comparator
		Collections.sort(list, new CityComparator());

		list.forEach(data -> {
			System.out.println(data.getId() + "," + data.getAge() + "," + data.getName() + "," + data.getCity());
		});

	}

}
