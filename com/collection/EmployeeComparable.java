package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.model.Employee;

public class EmployeeComparable {
	public static void main(String srgs[]) {
		List<Employee> list =  new ArrayList<Employee>();
		list.add(new Employee(1, "kinjal", 32, "Vadodara"));
		list.add(new Employee(2, "Bhavik", 32, "Surat"));
		list.add(new Employee(3, "Krunal", 25, "Amhadabad"));
		list.add(new Employee(4, "Harsh", 28, "Mumbai"));
		list.add(new Employee(5, "Janamjay", 25, "Delhi"));
		
		Collections.sort(list);
		list.forEach(e -> System.out.println(e.getId()
				+" "+e.getName()+""
				+" "+e.getAge()+""
				+" "+e.getCity()+""));
	}
}
