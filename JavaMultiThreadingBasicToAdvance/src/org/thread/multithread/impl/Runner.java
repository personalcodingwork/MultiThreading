package org.thread.multithread.impl;

public class Runner implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
