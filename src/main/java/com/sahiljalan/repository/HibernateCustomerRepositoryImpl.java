package com.sahiljalan.repository;

import java.util.ArrayList;
import java.util.List;

import com.sahiljalan.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private NamesDataImpl namesData;
	List<Customer> customers = new ArrayList<>();

	public void setNamesData(NamesDataImpl namesData) {
		this.namesData = namesData;
		namesData.setCustomerNames("Sahil", "Jalan", new Customer());
		namesData.setCustomerNames("Deepak", "Pan", new Customer());
		namesData.setCustomerNames("Chan", "Bhalla", new Customer());
		namesData.setCustomerNames("Raul", "Mahajan", new Customer());
		namesData.setCustomerNames("Shil", "Jalan", new Customer());
		namesData.setCustomerNames("Depak", "Pdey", new Customer());
		namesData.setCustomerNames("Chad", "Bhalla", new Customer());
		namesData.setCustomerNames("Sil", "Jlan", new Customer());
		namesData.setCustomerNames("Deepak", "Pandey", new Customer());
		namesData.setCustomerNames("Cand", "Balla", new Customer());
		namesData.setCustomerNames("Rahul", "Mahajan", new Customer());
		namesData.setCustomerNames("ahil", "Jlan", new Customer());
		namesData.setCustomerNames("Depak", "ndey", new Customer());
		namesData.setCustomerNames("and", "Balla", new Customer());
	}

	@Override
	public List<Customer> findAll(boolean findAll, Integer noOfRows)
			throws Exception {

		if (!findAll) {
			if (noOfRows > namesData.getCustomerSize())
				throw new ArrayIndexOutOfBoundsException(
						"Number of rows : Invalid");
			for (int i = 0; i < noOfRows; i++) {

				customers.add(namesData.getCustomerNames().get(i));
				System.out.println(customers.get(i).getFirstName() + " "
						+ customers.get(i).getLastName());
			}
		} else {
			throw new Exception(
					"Can Not Pass true value while sending No of rows");
		}

		return customers;

	}

	@Override
	public List<Customer> findAll(boolean findAll) {

		if (findAll) {
			if (namesData.getCustomerSize() == 0)
				throw new ArrayIndexOutOfBoundsException(
						"Number of rows : Invalid");
			for (int i = 0; i < namesData.getCustomerSize(); i++) {

				customers.add(namesData.getCustomerNames().get(i));
				System.out.println(customers.get(i).getFirstName() + " "
						+ customers.get(i).getLastName());
			}

		}

		return customers;

	}
}
