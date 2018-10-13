package org.certificatic.service;

import java.util.List;

import org.certificatic.model.Customer;
import org.certificatic.repository.CustomerRepository;
import org.certificatic.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
