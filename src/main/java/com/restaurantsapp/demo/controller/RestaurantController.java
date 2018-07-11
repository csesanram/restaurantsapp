package com.restaurantsapp.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantsapp.demo.pojo.CustomerInformation;
import com.restaurantsapp.demo.pojo.Transaction;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	static ArrayList<CustomerInformation> ci = new ArrayList<>();

	@RequestMapping(value= "/fetchcustomerinformation", method= RequestMethod.GET, produces ="application/json")
	public ArrayList<CustomerInformation> fetchCustomerInformation() {
		return ci;
	}
	
	@RequestMapping(value= "/fetchtransaction", method = RequestMethod.GET, produces = "application/json")
	public Transaction fetchTransaction() {
		Transaction trans = new Transaction();
		trans.setId(1001);
		CustomerInformation  c = new CustomerInformation();
		c.setFirstName("Sankar");
		c.setLastName("k");
		c.setAddress("Atlanta");
		c.setEmailId("c@gmail.com");
		c.setCustomerId(1001);
		c.setPhoneNo("717-829-3232");
		trans.setCi(c);
		trans.setTotal(100, 1);
		return trans;
	}
	
	@RequestMapping(value = "/savecustomerinformation", method = RequestMethod.POST, produces = "application/json")
	public ArrayList<CustomerInformation> saveCustomerInformation() {
		
		CustomerInformation customerA = new CustomerInformation();
		CustomerInformation customerB = new CustomerInformation();
		CustomerInformation customerC = new CustomerInformation();
		
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
		
		//Customer C Information
		customerC.setFirstName("Kamal");
		customerC.setLastName("Khan");
		customerC.setPhoneNo("717-829-3232");
		customerC.setEmailId("kamal.khan@gmail.com");
		customerC.setAddress("Atlanta");
		customerC.setCustomerId(1001);
		
		ci.add(customerA);
		ci.add(customerB);
		ci.add(customerC);
		
		return ci;
	}
	
}
