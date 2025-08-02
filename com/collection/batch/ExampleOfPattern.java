package com.collection.batch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleOfPattern {

	public static void main(String args[]) {
		String name = "welcomea";

		Pattern p = Pattern.compile("......e[a-zA-Z]");
		Matcher m = p.matcher(name);

		boolean val = m.matches();
		System.out.println(val);

		String testval = "Bharat7890";
		System.out.println(testval + "=" + Pattern.matches("[a-zA-Z0-9]{6}\\d{4}", testval));
	}
}
