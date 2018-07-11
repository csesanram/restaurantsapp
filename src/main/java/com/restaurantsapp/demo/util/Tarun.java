package com.restaurantsapp.demo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.restaurantsapp.demo.pojo.CustomerInformation;
import com.restaurantsapp.demo.pojo.Offer;
import com.restaurantsapp.demo.pojo.Transaction;
import com.restaurantsapp.demo.pojo.Offer.Day;

@SuppressWarnings("unused")
public class Tarun {
	static ArrayList<CustomerInformation> customerListArray = new ArrayList<>();
	static HashMap<Transaction, CustomerInformation> customerTransactions = new HashMap<>();
	static LinkedList<CustomerInformation> customerListLinked = new LinkedList<>();
	
	public static void main(String[] args) {
		
		CustomerInformation customerA = new CustomerInformation();
		CustomerInformation customerB = new CustomerInformation();
		
		//Customer A Information
		customerA.setFirstName("Joe");
		customerA.setLastName("Doe");
		customerA.setPhoneNo("850-431-4919");
		customerA.setEmailId("joe.deo@ymail.com");
		customerA.setAddress("27 York Street");
		customerA.setCustomerId(5454);
		
		//Customer B Information
		customerB.setFirstName("Salman");
		customerB.setLastName("Salmon");
		customerB.setPhoneNo("749-871-3124");
		customerB.setEmailId("salman.salmon@ymail.com");
		customerB.setAddress("32 New Street");
		customerB.setCustomerId(8692);
	
		//Offer Instantiation
		Offer ofOne = new Offer();
		Offer ofTwo = new Offer();
		
		//Transaction Instantiation
		Transaction transOne = new Transaction();
		transOne.setId(123);
		transOne.setTotal(10, 5);
		transOne.setCi(customerA);
		ofOne.setTransInformation(transOne);
		ofOne.setApplyOffer(Day.Sunday);
		transOne.setTotalAfterCoupon(ofOne.getAfterApplyOffer());
	
		Transaction transTwo = new Transaction();
		transTwo.setId(234);
		transTwo.setTotal(13, 3);
		transTwo.setCi(customerB);
		ofTwo.setTransInformation(transTwo);
		ofTwo.setApplyOffer(Day.Monday);
		transTwo.setTotalAfterCoupon(ofTwo.getAfterApplyOffer());
		
		// HashMap<Transaction, CustomerInformation>
		customerTransactions.put(transOne, customerA);
		customerTransactions.put(transTwo, customerB);
		
		//Print Transactions HashMap
		printTransactions();
		
//		//Add Customers To ArrayList
//		addCustomers();
//		
//		//Print ArrayList Customers
//		printCustomers(customerListArray);
//		
//		// Check If Customer Exists In The ArrayList
//		System.out.println(checkCustomer("Raj"));
//		
//		// Convert ArrayList Customers to LinkedList
//		convertToLinked();
//		System.out.println("ArrayList Converted to LinkedList");
//		
//		// Linked List addFirst
//		customerListLinked.addFirst(customerA);
//		System.out.println("Added Customer To First Link");
//		
//		// Linked List addLast
//		customerListLinked.addLast(customerB);
//		System.out.println("Added Customer To Last Link");
		
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
	 * Print Customer Transactions Using Transaction Key
	 */
	private static void printTransactions() {
		
		System.out.println("Customer Transactions");
		System.out.println("=====================");
		
		for(Transaction key : customerTransactions.keySet()) {
			CustomerInformation temp = customerTransactions.get(key);
			System.out.println("Transaction Id: "+key.getId());
			System.out.println("Customer Id: "+temp.getCustomerId());
			System.out.println("Name : "+temp.getFirstName());
			System.out.println("Amount : $"+key.getTotal());
			System.out.println("Discount : $"+(key.getTotal()-key.getTotatlAfterCoupon()));
			System.out.println("Total Amount : $"+key.getTotatlAfterCoupon());
			System.out.println("---------------------------------------------------------");
		}
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
	 * Check If Customer Exists In The ArrayList
	 */
	private static String checkCustomer(String customer) {
		
		for(CustomerInformation c : customerListArray) {
			if(c.getFirstName().toLowerCase().equals(customer.toLowerCase())) {
				return "Customer '" + customer + "' Found In The List";
			}
		}
		return "Customer '" + customer + "' Not Found";
	}

	/**
	 * Take User Input And Add Customers To The ArrayList
	 */
	private static void addCustomers() {
		
		Scanner ai = new Scanner(System.in);
		while(true) {
			System.out.print("First Name: ");
		 	String fname = ai.next();
			System.out.print("Last Name: ");
			String lname = ai.next();
			System.out.print("Phone #: ");
			String phone = ai.next();
			System.out.print("E-Mail: ");
			String email = ai.next();
			System.out.print("Address: ");
			String addr = ai.next();
			ai.nextLine();
			
			CustomerInformation customer = new CustomerInformation();
			customer.setFirstName(fname);
			customer.setLastName(lname);
			customer.setPhoneNo(phone);
			customer.setEmailId(email);
			customer.setAddress(addr);
			customerListArray.add(customer);
			
			System.out.print("Enter 'C' To Add More Or 'Q' To Quit : ");
			String check = ai.next();
			if(check.toLowerCase().equals("q")) {
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

