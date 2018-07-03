/**
 * 
 */
package com.restaurantsapp.demo.util;

/**
 * @author User
 *
 */
public class ThreadExample extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread("New Thread") {
			public void run() {
				System.out.println("t1 thread started :: " + getName());
			}
		};
		t1.start();
		System.out.println("I'm starting first:: "+t1.getName());
		
		//Thread t2 = new Thread(new MY )
	}

}
