package com.lambda;

import java.util.LinkedList;

import com.collection.model.Book;
import com.lambdainterface.Addable;

public class LambdaExpressionExample {

	public static void main(String args[]) {
		//lambda expression without return keyword
		Addable ans = (a,b)->(a+b);
		System.out.println(ans.add(10, 20));
		
		//lambda expression with return keyword
		Addable ans1 = (a,b)-> {
			return a+b;
		};
		System.out.println(ans1.add(20, 50));
		
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
        
        for (Book book : list) {
			System.out.println(book.getId()+","+book.getAuthor()
			+", "+book.getId());
			}
       //forloop using lambda expression
        System.out.println("==========================================");
        list.forEach((x)->{System.out.println(x.getId()+","+x.getAuthor()
		+", "+x.getId());});
	}
}
