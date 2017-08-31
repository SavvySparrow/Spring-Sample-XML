package com.sahiljalan.repository;

import java.util.ArrayList;
import java.util.List;

import com.sahiljalan.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.sahiljalan.repository.CustomerRepository#fineAll()
	 */
	@Override
	public List<Customer> fineAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Sahil");
		customer.setLastName("Jalan");
		
		customers.add(customer);
		
		return customers;

	}
}
