package com.collection.batch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.batch.comparator.SalaryComparator;
import com.collection.batch.model.Employee;

public class Example_1OFComparable {

	public static void main(String ar[]) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Yash", "vadodara", "10000"));
		list.add(new Employee(2, "Ziyan", "Bardoli", "30000"));
		list.add(new Employee(3, "Joy", "Surat", "80000"));
		list.add(new Employee(4, "Kishan", "Mehasana", "90000"));

		list.forEach(data -> {
			System.out
					.println(data.getId() + " , " + data.getName() + " , " + data.getCity() + " , " + data.getSalary());
		});

		Collections.sort(list);
		System.out.println("======== sorted list ==========");
		list.forEach(data -> {
			System.out
					.println(data.getId() + " , " + data.getName() + " , " + data.getCity() + " , " + data.getSalary());
		});

		Collections.sort(list, new SalaryComparator());
		System.out.println("======== using comparator sorted list ==========");
		list.forEach(data -> {
			System.out
					.println(data.getId() + " , " + data.getName() + " , " + data.getCity() + " , " + data.getSalary());
		});

		Comparator<Employee> cp = Comparator.comparing(Employee::getSalary);
		Collections.sort(list, cp);
		System.out.println("======== using comparator filter by name ==========");
		list.forEach(data -> {
			System.out
					.println(data.getId() + " , " + data.getName() + " , " + data.getCity() + " , " + data.getSalary());
		});

	}

}
