package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Customer;
import com.project.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class HomeController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {
	return ResponseEntity.ok(service.getCustomers());
    }

    @PostMapping
    public ResponseEntity<Customer> registerUser(@RequestBody Customer customer) {
	return ResponseEntity.ok(service.saveCustomer(customer));
    }

}
