package org.certificatic.repository;

import java.util.List;

import org.certificatic.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}