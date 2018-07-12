package com.restaurantsapp.demo.util;

import java.util.ArrayList;

import com.restaurantsapp.demo.pojo.CustomerInformation;

public class SampleCustomers {
	
	private ArrayList<CustomerInformation> ci = new ArrayList<>();
	
	public ArrayList<CustomerInformation> getSamplesArray(){
		
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
