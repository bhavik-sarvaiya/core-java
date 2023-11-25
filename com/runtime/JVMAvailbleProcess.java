package com.runtime;

public class JVMAvailbleProcess {
	public static void main(String args[]) throws Exception {
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
