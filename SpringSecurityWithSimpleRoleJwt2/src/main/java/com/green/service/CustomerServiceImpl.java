package com.green.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.exception.CustomerException;
import com.green.model.Customer;
import com.green.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {

		return customerRepository.save(customer);

	}

	@Override
	public Customer getCustomerDetailsByEmail(String email) throws CustomerException {

		return customerRepository.findByEmail(email)
				.orElseThrow(() -> new CustomerException("Customer Not found with Email: " + email));
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {

		List<Customer> customers = customerRepository.findAll();

		if (customers.isEmpty())
			throw new CustomerException("No Customer find");

		return customers;

	}

}
