package org.thread.multithread.impl;

public class ApplicationThreadImpl {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		
		t1.start();
		t2.start();
	}

}
