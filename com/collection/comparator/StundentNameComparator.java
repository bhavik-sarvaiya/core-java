package com.collection.comparator;

import java.util.Comparator;

import com.collection.model.Student;

public class StundentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
