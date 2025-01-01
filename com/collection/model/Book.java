package com.collection.model;

public class Book implements Comparable<Book> {
	public int id;
	public String name;
	public String author;
	public Double price;

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;

	}

	public Book(int i, String string, String string2, double d) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = d;
	}

	@Override
	public int compareTo(Book book) {
		if (name == book.name) {
			return 0;
		} else if (!name.equals(book.name)) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}
