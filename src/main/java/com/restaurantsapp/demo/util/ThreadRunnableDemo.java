/**
 * 
 */
package com.restaurantsapp.demo.util;

/**
 * @author User
 *
 */
public class ThreadRunnableDemo implements Runnable{
	
	private Thread t;
	private String threadName;
	
	ThreadRunnableDemo (String name) {
		threadName = name;
		System.out.println("Creating  " + threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + threadName);
		
		for (int i=5; i> 0; i--) {
			System.out.println("Thread: "+ threadName + ", "+ i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread: "+ threadName + " interrupted");
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread: "+ threadName + " exiting");
		
	}
	
	public void start() {
		System.out.println("Starting: "+ threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
