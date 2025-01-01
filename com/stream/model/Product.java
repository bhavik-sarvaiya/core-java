package com.stream.model;

public class Product {
	private Integer id;
	private String name;
	private Integer price;
	private Integer type;
	
	Product() {
	}

	public Product(Integer id, String name, Integer price, Integer type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	
}
