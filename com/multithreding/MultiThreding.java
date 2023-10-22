package com.multithreding;

public class MultiThreding extends Thread {

	public void run() {
		System.out.println("Thred is runing.....");
	}

	public static void main(String args[]) {
		MultiThreding mt = new MultiThreding();
		mt.start();
	}

}
