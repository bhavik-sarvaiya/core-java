package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.collection.model.Student;

public class ExampleOfCollection {

	public static void main(String[] x) {
		// List<String> list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aman");
		list.add("chirag");
		list.add("kinjal");
		list.add("krunal");
		list.add("Harsh");
		list.add("JJ");
		System.out.println(list.get(2));

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Yash", 5));
		studentList.add(new Student(2, "Yashraj", 6));
		studentList.add(new Student(3, "krunal", 7));
		studentList.add(new Student(4, "pratik", 8));

		System.out.println("-----------------------------------\n" + studentList);

		studentList.forEach(val -> {
			System.out.println(val.getRollno() + " , " + val.getName() + " , " + val.getAge());
		});

		System.out.println("-----------------------------------");
		/*
		 * (expression) -> { body };
		 *
		 */
		System.out.println("using lemabda expression :");
		list.forEach((val) -> {
			System.out.println("=> " + val);
		});

		System.out.println("using for each :");
		// for loop
		for (String val : list) {
			System.out.println("=> " + val);
		}

		System.out.println("using for loop :");
		// for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("=> " + list.get(i));
		}

		System.out.println("using for Iterator :");
		// Iterator
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println("=> " + itr.next());

		}
//		Iterator itr1 = list.iterator();
//		itr1.remove();
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}

	}
}
