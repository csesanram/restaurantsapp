package com.restaurantsapp.demo.controller;

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

	@RequestMapping(value= "/fetchcustomerinformation", method= RequestMethod.GET, produces ="application/json")
	public CustomerInformation fetchCustomerInformation() {
		CustomerInformation  c = new CustomerInformation();
		c.setFirstName("Sankar");
		c.setLastName("k");
		c.setAddress("Atlanta");
		c.setEmailId("c@gmail.com");
		c.setCustomerId(1001);
		c.setPhoneNo("717-829-3232");
		return c;
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
	
}
