package com.tts.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tts.collection.demo.comparator.CityComprater;
import com.tts.collection.demo.comparator.StateComparator;
import com.tts.collection.demo.entity.Address;

public class ComapratoreExample {

	public static void main(String a[]) {
		List<Address> list = new ArrayList<Address>();
		list.add(new Address(1, "vadodara", "Gujarat", "390021"));
		list.add(new Address(2, "surat", "Gujarat", "210021"));
		list.add(new Address(3, "ahmedabad", "Gujarat", "490001"));
		list.add(new Address(4, "mumbai", "Maharatra", "690021"));
		list.add(new Address(5, "indore", "MP", "690021"));

		list.forEach(System.out::println);
		System.out.println("--------------------");
		// Collections.sort(list,new CityComprater());

		Comparator<Address> cp = Comparator.comparing(Address::getCity);
		Collections.sort(list, cp);
		list.forEach(System.out::println);

		System.out.println("--------------------");
		// Collections.sort(list,new StateComparator());
		Comparator<Address> cp1 = Comparator.comparing(Address::getPincode);
		Collections.sort(list, cp1);

		list.forEach(System.out::println);

		System.out.println("--------------------");
		// Collections.sort(list,new StateComparator());
		Comparator<Address> cp2 = Comparator.comparing(Address::getId);
		Collections.sort(list, cp2);

		list.forEach(System.out::println);

		System.out.println("--------------------");

		list.forEach(data -> System.out
				.println(data.getId() + " , " + data.getCity() + " , " + data.getState() + " , " + data.getPincode()));

	}
}
