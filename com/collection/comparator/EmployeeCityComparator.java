package com.collection.comparator;

import java.util.Comparator;

import com.collection.model.EmployeeComaprator;

public class EmployeeCityComparator implements Comparator<EmployeeComaprator>{

	@Override
	public int compare(EmployeeComaprator o1, EmployeeComaprator o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}
