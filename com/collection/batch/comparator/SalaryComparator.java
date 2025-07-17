package com.collection.batch.comparator;

import java.util.Comparator;

import com.collection.batch.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getCity().compareTo(employee2.getCity());
	}
}
