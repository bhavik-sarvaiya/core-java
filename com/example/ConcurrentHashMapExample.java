package com.example;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        scores.put("Alice", 10);
        scores.put("Bob", 15);
        scores.put("Charlie", 20);

        Runnable runnable = () -> {
            for (String name : scores.keySet()) {
                int score = scores.get(name);
                scores.put(name, score + 5);
                System.out.println(name+" => value"+score);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread1.sleep(2000);
        thread2.start();
        thread2.sleep(2000);
        
        thread3.start();
        thread3.sleep(2000);

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(scores);
    }
}

