/**
 * 
 */
package com.restaurantsapp.demo.util;

/**
 * @author User
 *
 */
public class CustomerException extends Exception{

	/**
	 * 
	 */
	public CustomerException() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerException(String exception) {
		// TODO Auto-generated constructor stub
		
		System.out.println("My Own Exception class:: "+exception);
	}

}
