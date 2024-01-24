package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.collection.comparator.EmployeeCityComparator;
import com.collection.comparator.EmployeeNameComparator;
import com.collection.model.Employee;
import com.collection.model.EmployeeComaprator;

public class ExampleEmployeeComparatore {

	public static void main(String srgs[]) {
		List<EmployeeComaprator> list = new ArrayList<EmployeeComaprator>();
		list.add(new EmployeeComaprator(1, "kinjal", 32, "Vadodara"));
		list.add(new EmployeeComaprator(2, "Bhavik", 32, "Surat"));
		list.add(new EmployeeComaprator(3, "Krunal", 25, "Amhadabad"));
		list.add(new EmployeeComaprator(4, "Harsh", 28, "Mumbai"));
		list.add(new EmployeeComaprator(5, "Janamjay", 25, "Delhi"));

		System.out.println("===== city comaparator =====");
		Collections.sort(list, new EmployeeNameComparator());
		list.forEach(e -> System.out
				.println(e.getId() + " " + e.getName() + "" + " " + e.getAge() + "" + " " + e.getCity() + ""));

		System.out.println("===== city comaparator =====");
		Collections.sort(list, new EmployeeCityComparator());
		list.forEach(e -> System.out
				.println(e.getId() + " " + e.getName() + "" + " " + e.getAge() + "" + " " + e.getCity() + ""));

		System.out.println("=====using java 8 city comaparator =====");

		Comparator name = Comparator.comparing(EmployeeComaprator::getName, Comparator.reverseOrder());
		Collections.sort(list, name);
		list.forEach(e -> System.out
				.println(e.getId() + " " + e.getName() + "" + " " + e.getAge() + "" + " " + e.getCity() + ""));

	}
}
