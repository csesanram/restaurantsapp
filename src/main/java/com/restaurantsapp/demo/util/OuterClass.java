/**
 * 
 */
package com.restaurantsapp.demo.util;

/**
 * @author User
 *
 */
public class OuterClass {

	// inner class
	class NestedClass {
		public void displayPrint() {
			System.out.println("I am in inside nested class display print method();");
		}
	}
	
	// acccessing the inner class from the method with in
	void displayInnnerClass() {
		NestedClass nestedClassObj = new NestedClass();
		nestedClassObj.displayPrint();
	}

}