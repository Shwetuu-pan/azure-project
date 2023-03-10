package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
