package org.thread.multithread.ext;

public class Increment extends Thread{
	static int count = 0;
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread+" : "+(++count));
		}
	}
}
