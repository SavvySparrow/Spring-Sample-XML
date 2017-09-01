package com.sahiljalan.repository;

import java.util.List;

import com.sahiljalan.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll(boolean val,Integer noOfRows) throws Exception;
	public abstract List<Customer> findAll(boolean val);

}