/**
 * 
 */
package com.restaurantsapp.demo.util;

/**
 * @author User
 *
 */
public class TestThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnableDemo t1  = new ThreadRunnableDemo("Thread - 1");
		t1.start();
		
		ThreadRunnableDemo t2  = new ThreadRunnableDemo("Thread - 2");
		t2.start();
		
		
		ThreadRunnableDemo t3  = new ThreadRunnableDemo("Thread - 3");
		t3.start();
		
	}

}
