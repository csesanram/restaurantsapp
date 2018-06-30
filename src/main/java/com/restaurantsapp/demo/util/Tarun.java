package com.restaurantsapp.demo.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.restaurantsapp.demo.pojo.CustomerInformation;

public class Tarun {
	static ArrayList<CustomerInformation> customerListArray = new ArrayList<>();
	static LinkedList<CustomerInformation> customerListLinked = new LinkedList<>();
	
	public static void main(String[] args) {
		
		CustomerInformation customerA = new CustomerInformation();
		CustomerInformation customerB = new CustomerInformation();
		
		//Add Customers To ArrayList
		addCustomers();
		
		//Print ArrayList Customers
		printCustomers(customerListArray);
		
		// Check If Customer Exists In The ArrayList
		System.out.println(checkCustomer("Raj"));
		
		// Convert ArrayList Customers to LinkedList
		convertToLinked();
		System.out.println("ArrayList Converted to LinkedList");
		
		// Linked List addFirst
		customerA.setFirstName("Joe");
		customerA.setLastName("Doe");
		customerA.setPhoneNo(1234);
		customerA.setEmailId("joe.deo@ymail.com");
		customerA.setAddress("27 York Street");
		customerListLinked.addFirst(customerA);
		System.out.println("Added Customer To First Link");
		
		// Linked List addLast
		customerB.setFirstName("Salman");
		customerB.setLastName("Salmon");
		customerB.setPhoneNo(4314);
		customerB.setEmailId("salman.salmon@ymail.com");
		customerB.setAddress("32 New Street");
		customerListLinked.addLast(customerB);
		System.out.println("Added Customer To Last Link");
		
//		//Override
//		MultisA parentOverride = new MultisA();
//		parentOverride.printMultisRidden();
//		MultisA override = new MultisB();
//		override.printMultisRidden();
//		
//		//Overload
//		MultisA parentOverload = new MultisA();
//		parentOverload.printMultisLoaded(2);
//		parentOverload.printMultisLoaded(4, 10);
		
	}
	
	/**
	 * Convert Customers From ArrayList to LinkedList
	 */
	private static void convertToLinked() {
		for(CustomerInformation c : customerListArray) {
			customerListLinked.add(c);
		}
	}

	/**
	 * @param Customer Name
	 * @return String - Found/Not Found
	 * Check If User Exists In The ArrayList
	 */
	private static String checkCustomer(String customer) {
		for(CustomerInformation c : customerListArray) {
			if(c.getFirstName().toLowerCase().equals(customer))
				return "Customer '" + customer + "' Found In The List";
		}
		return "Customer '" + customer + "' Not Found";
	}

	/**
	 * Take User Input And Add Customers To The ArrayList
	 */
	private static void addCustomers() {
		
		Scanner ai = new Scanner(System.in);
		while(true) {
			System.out.println("First Name");
		 	String fname = ai.nextLine();
			System.out.println("Last Name");
			String lname = ai.nextLine();
			System.out.println("Phone #");
			String phone = ai.nextLine();
			System.out.println("E-Mail");
			String email = ai.nextLine();
			System.out.println("Address");
			String addr = ai.nextLine();
			
			CustomerInformation customer = new CustomerInformation();
			customer.setFirstName(fname);
			customer.setLastName(lname);
			customer.setPhoneNo(Integer.parseInt(phone));
			customer.setEmailId(email);
			customer.setAddress(addr);
			customerListArray.add(customer);
			
			System.out.println("Enter 'C' To Add More Or 'Q' To Quit : ");
			String corq = ai.nextLine();
			if(corq.toLowerCase().equals("q")) {
				break;
			}
		}
		ai.close();
	}

	/**
	 * @param customerList - ArrayList Of Customers
	 * Prints All The Customers In The ArrayList
	 */
	private static void printCustomers(ArrayList<CustomerInformation> customerList) {
		if(customerList.isEmpty()) 
			System.out.println("Customer List Is Empty");
		else {
			System.out.println("Printing Customer List");
			System.out.println("----------------------");
			for(CustomerInformation c : customerList) {
				System.out.println(c);
			}
		}
	}

}

class MultisA{
	public void printMultisRidden() {
		System.out.println("Before Override");
		for(int i=1; i <= 10; i++) {
			System.out.println(2 * i);
		}
	}
	public void printMultisLoaded(int x) {
		System.out.println("Before Overload");
		for(int i=1; i <= 10; i++) {
			System.out.println(x * i);
		}
	}
	public void printMultisLoaded(int x, int y) {
		System.out.println("Overloaded");
		for(int i=1; i <= y; i++) {
			System.out.println(x * i);
		}
	}
}

class MultisB extends MultisA{
	public void printMultisRidden() {
		System.out.println("Overriden");
		for(int i=1; i <= 10; i++) {
			System.out.println(4 * i);
		}
	}
}

