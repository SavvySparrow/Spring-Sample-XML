package com.sahiljalan.repository;

import java.util.Map;

import com.sahiljalan.model.Customer;

public class NamesDataImpl implements NamesData {

	private static int count;
	private Map<Integer, Customer> customerNames;

	public NamesDataImpl() {

	}

	public NamesDataImpl(Map<Integer, Customer> customerNames) {
		this.customerNames = customerNames;
	}

	@Override
	public void setCustomerNames(String fName, String lName,Customer customer) {

		customer.setFirstName(fName);
		customer.setLastName(lName);
		customerNames.put(count++, customer);
	
	}

	public Integer getCustomerSize() {

		return customerNames.size();

	}
	
	public Map<Integer, Customer> getCustomerNames() {
		
		return customerNames;

	}
}
