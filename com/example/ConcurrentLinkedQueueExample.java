package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
	public static void main(String[] args) throws InterruptedException {
		ConcurrentLinkedQueue<String> tasks = new ConcurrentLinkedQueue<>();

		tasks.offer("Task 1");
		tasks.offer("Task 2");
		tasks.offer("Task 3");

		List<String> updated = new ArrayList<String>();
		Runnable runnable = () -> {
			while (!tasks.isEmpty()) {
				String task = tasks.poll();
				updated.add(task);
				System.out.println("Processing task: " + task);
			}
		};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);

		thread1.start();
		thread1.sleep(2000);
		System.out.println("thread 2");
		thread2.start();
		thread2.sleep(2000);

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(updated);
	}
}
