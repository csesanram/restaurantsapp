package com.restaurantsapp.demo.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantsapp.demo.pojo.CustomerInformation;
import com.restaurantsapp.demo.pojo.Status;
import com.restaurantsapp.demo.pojo.Transaction;
import com.restaurantsapp.demo.util.SampleCustomers;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	static ArrayList<CustomerInformation> ci = new ArrayList<>();
	SampleCustomers sc = new SampleCustomers();
	
	@RequestMapping(value= "/fetchcustomerinformation", method= RequestMethod.GET, produces ="application/json")
	public ArrayList<CustomerInformation> fetchCustomerInformation() {
		return ci;
	}
	
	@RequestMapping(value= "/fetchtransaction", method = RequestMethod.GET, produces = "application/json")
	public Transaction fetchTransaction() {
		Transaction trans = new Transaction();
		trans.setId(1001);
		
		CustomerInformation customer = sc.getSamplesArray().get(0);
		trans.setCi(customer);
		trans.setTotal(100, 1);
		return trans;
	}
	
	@RequestMapping(value = "/savecustomerinformation", method = RequestMethod.POST, produces = "application/json")
	public Status saveCustomerInformation(@RequestBody Map<String, String> customerInformation) {
		// collecting input
		System.out.println(customerInformation.get("firstName"));
		
		// below the part comes from services/business logic layer
		Status s = new Status();
		s.setStatusCode("200");
		s.setStatusMessage("Successfully Saved Customer Information");
		
		return s;
	}
	
}
