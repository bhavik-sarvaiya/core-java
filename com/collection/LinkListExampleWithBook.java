package com.collection;

import com.collection.comparator.AuthorWiseComparator;
import com.collection.model.Book;
import com.collection.comparator.NameComparator;

import java.util.LinkedList;

public class LinkListExampleWithBook {
    public static void main(String[] args) {
        Book book1 = new Book(1, "java", "ronak");
        Book book2 = new Book(3, "java", "hitesh");
        Book book3 = new Book(2, "c", "jaimin");
        Book book4 = new Book(7, "c++", "ajay");
        Book book5 = new Book(9, "python", "babaa");
        Book book6 = new Book(8, "Dot net", "test");
        LinkedList<Book> list = new LinkedList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);

        list.sort(new AuthorWiseComparator());

        for(Book book:list)
        {
            System.out.println(book.id+","+ book.name+","+book.author);

        }
    }
}
