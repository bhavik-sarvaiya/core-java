package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDqueueExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");


        deque.offerFirst("this last element");
        deque.addFirst("this first element");
        deque.removeLast();


        for (String val:deque ) {
            System.out.println(val);
        }
    }
}
