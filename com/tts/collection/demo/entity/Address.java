package com.tts.collection.demo.entity;

public class Address {
	private Integer id;
	private String city;
	private String state;
	private String pincode;

	public Address(Integer id, String city, String state, String pincode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
