package com.collection.comparator;

public class StudentComparable implements Comparable<StudentComparable> {
	private String name;
	private String id;
	private int age;

	public StudentComparable(String name, String id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparable st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return -1;
		else
			return 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
