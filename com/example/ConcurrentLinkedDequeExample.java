package com.example;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();

        deque.offerFirst("Item 1");
        deque.offerLast("Item 2");

        Runnable runnable1 = () -> {
            while (!deque.isEmpty()) {
                String item = deque.pollFirst();
                System.out.println("Thread 1 processed: " + item);
            }
        };

        Runnable runnable2 = () -> {
            while (!deque.isEmpty()) {
                String item = deque.pollLast();
                System.out.println("Thread 2 processed: " + item);
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
