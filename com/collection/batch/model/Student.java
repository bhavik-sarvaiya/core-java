package com.collection.batch.model;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private Integer age;
	private String city;
	private String div;

	public Student(String id, String name, Integer age, String city, String div) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.div = div;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	@Override
	public int compareTo(Student o) {
		if (age == o.age)
			return 0;
		else if (age > o.getAge())
			return -1;
		else
			return 1;
	}

}
