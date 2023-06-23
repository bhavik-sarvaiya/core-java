package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.collection.model.Book;

public class Example14 {

	public static void main(String args[]) {
		ArrayList<Book> list = new ArrayList();
		list.add(new Book(1, "java", "mahesh", 1000.0));
		list.add(new Book(2, "rich-dad", "robort", 2000.50));
		list.add(new Book(3, "5AM Club", "xyz", 5000.00));

		List<Double> price = list.stream().filter(val -> val.price < 3000).map(map -> map.price)
				.collect(Collectors.toList());

		System.out.println("filter price =" + price);

		List<Double> greterPrice = list.stream().filter(val -> val.price > 3000).map(map -> map.price)
				.collect(Collectors.toList());

		System.out.println("filter Greater price =" + greterPrice);

		// list.forEach(System.out::println);

		List<Book> fltrList = list.stream().filter(val -> val.price < 3000).collect(Collectors.toList());

		fltrList.forEach(System.out::println);

	}

}
