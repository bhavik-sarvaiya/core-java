package com.collection.batch;

import java.util.ArrayList;
import java.util.Collections;

import com.collection.batch.model.Student;

public class ExampleOfComparable {
	public static void main(String args[]) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("1", "sneha", 25, "vadodara", "A"));
		list.add(new Student("2", "surabha", 35, "surat", "B"));
		list.add(new Student("3", "bhavin", 16, "surat", "B"));
		list.add(new Student("4", "manish", 25, "ahmedabad", "A"));

		Collections.sort(list);

		list.forEach(data -> {
			System.out.println(data.getId() + "," + data.getAge() + "," + data.getName() + "," + data.getCity());
		});

	}
}
