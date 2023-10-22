package com.aggregation;

public class Address {
	private int id;
	private String type;
	private String city;
	private String state;
	private String pincode;
	
	
	
	public Address() {
	}
	
	public Address(int id, String type, String city, String state, String pincode) {
		this.id = id;
		this.type = type;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
