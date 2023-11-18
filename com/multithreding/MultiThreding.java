package com.multithreding;

public class MultiThreding extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			// the thread will sleep for the 1000 milli seconds
			try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i + " --> " + Thread.currentThread().getName());

		}
	}

	public static void main(String args[]) throws InterruptedException {
		MultiThreding t1 = new MultiThreding();
		MultiThreding t2 = new MultiThreding();
		MultiThreding t3 = new MultiThreding();

		t1.start();
		t1.setName("T1");
		// t1.join(3000);

		t2.start();
		t2.setName("T2");
		// t2.join(5000);

		t3.start();
		t3.setName("T3");
	}

}
