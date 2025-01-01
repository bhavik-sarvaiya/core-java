package com.tts.collection.demo.comparator;

import java.util.Comparator;

import com.tts.collection.demo.entity.Address;

public class CityComprater implements Comparator<Address>{

	@Override
	public int compare(Address add, Address add2) {
		return add.getCity().compareTo(add2.getCity());
	}

}
