package com.sahiljalan.service;

import java.util.List;

import com.sahiljalan.model.Customer;
import com.sahiljalan.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	@Override
	public List<Customer> findAll(boolean val, Integer rows) throws Exception {
		return customerRepository.findAll(val, rows);
	}

	@Override
	public List<Customer> findAll(boolean val) {
		return customerRepository.findAll(true);
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
