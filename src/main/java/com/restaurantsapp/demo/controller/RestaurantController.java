package com.restaurantsapp.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantsapp.demo.pojo.CustomerInformation;

/**
 * @author User
 *
 */
@RestController
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
	
}
