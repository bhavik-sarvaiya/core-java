package com.tts.collection.demo.comparator;

import java.util.Comparator;

import com.tts.collection.demo.entity.Address;

public class StateComparator implements Comparator<Address>{

	@Override
	public int compare(Address o1, Address o2) {
		return o1.getState().compareTo(o2.getState());
	}

}
