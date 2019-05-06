package org.thread.multithread.ext;

public class Runner extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
