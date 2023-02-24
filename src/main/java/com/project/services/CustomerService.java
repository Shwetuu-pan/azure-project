package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Customer;
import com.project.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public List<Customer> getCustomers() {
	return repo.findAll();
    }

    public Customer saveCustomer(Customer user) {
	return repo.save(user);
    }

}
