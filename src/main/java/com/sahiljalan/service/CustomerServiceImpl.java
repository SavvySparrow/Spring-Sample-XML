package com.sahiljalan.service;

import java.util.List;

import com.sahiljalan.model.Customer;
import com.sahiljalan.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.fineAll();
	}

	/*public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}*/

}
