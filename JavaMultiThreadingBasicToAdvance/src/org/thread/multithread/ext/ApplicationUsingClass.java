package org.thread.multithread.ext;

public class ApplicationUsingClass {

	public static void main(String[] args) {
//		Runner runner1 = new Runner();
//		runner1.start();
//		
//		Runner runner2 = new Runner();
//		runner2.start();
		Increment increment1 = new Increment();
		increment1.start();
		
		Increment increment2 = new Increment();
		increment2.start();
	}

}
