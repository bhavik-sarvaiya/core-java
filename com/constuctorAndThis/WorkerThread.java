package com.constuctorAndThis;

public class WorkerThread {
	private static String message;
	private static String message1;
	
	public WorkerThread(String message) {
		this.message = message;
	}
	
	public WorkerThread(String message,String message1) {
		this.message = message;
		this.message1 = message1;
	}
	
	public void displayMessage() {
		System.out.println(" message := "+message );
	}
	
	public void displayMessage1() {
		System.out.println(" message := "+ message +" msg 1 = "+message1 );
	}
	public static void main(String []x) {
		String msg = "Hello, All java team";
		String msg1 = "Hello 1, All java team";
		WorkerThread wk = new WorkerThread(msg ,msg1);
		WorkerThread wk1 = new WorkerThread(msg1);
		
		wk.displayMessage1();
		wk1.displayMessage();
	}
}
