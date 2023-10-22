package com.multithreding;

public class MultiThredingWithRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("Runing method....");
	}

	public static void main(String args[]) {
		MultiThredingWithRunable mt = new MultiThredingWithRunable();
		Thread t1 = new Thread(mt);
		t1.start();

		Thread t2 = new Thread(mt);
		t2.start();
	}

}
