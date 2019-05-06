package org.thread.multithread.impl;

public class ApplicationThreadImplAnonemious {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread : " + i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread : " + i);
				}
			}
		});
		t1.start();
		t2.start();
	}

}
