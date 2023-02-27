package com.collection.model;

public class Book implements Comparable<Book>{
    public int id;
    public String name;
    public String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public int compareTo(Book book) {
        if(name == book.name){
            return 0;
        } else if (!name.equals(book.name)) {
            return 1;
        }else {
            return -1;
        }
    }
}
