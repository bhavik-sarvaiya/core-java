package com.tts.collection.demo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String args[]) {
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("mango");
		linkList.add("apple");
		linkList.add("orange");

		for (String val : linkList) {
			System.out.println(val);
		}
		Collections.sort(linkList);

		linkList.addFirst("graps");
		System.out.println("=====add first method=======");
		for (String val : linkList) {
			System.out.println(val);
		}

		Collections.sort(linkList, Collections.reverseOrder());
		linkList.addLast("peer");
		System.out.println("=====last first method=======");
		for (String val : linkList) {
			System.out.println(val);
		}
	}
}
