package com.aggregation;

public class Employee {
	private int id;
	private String name;
	private String contactNo;
	
	private Address address; //Aggregation 

	public Employee() {
	}

	public Employee(int id, String name, String contactNo, Address address) {
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
