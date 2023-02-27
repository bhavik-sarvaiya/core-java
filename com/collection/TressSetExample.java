package com.collection;

import com.collection.model.Book;

import java.util.TreeSet;

public class TressSetExample {
    public static void main(String[] args) {
        Book book1 = new Book(1, "java", "ronak");
        Book book2 = new Book(3, "java", "ronak");
        Book book3 = new Book(2, "c", "ronak");
        Book book4 = new Book(7, "c++", "ronak");
        Book book5 = new Book(9, "python", "ronak");
        Book book6 = new Book(8, "Dot net", "ronak");
        TreeSet<Book> list = new TreeSet<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);

        //list.comparator(Comparator.comparing());
        for (Book book : list) {
            System.out.println(book.id + "," + book.name + "," + book.author);

        }
    }

}
