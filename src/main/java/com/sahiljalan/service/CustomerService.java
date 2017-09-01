package com.sahiljalan.service;

import java.util.List;

import com.sahiljalan.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll(boolean val,Integer noOfRows) throws Exception;
	public abstract List<Customer> findAll(boolean val);

}