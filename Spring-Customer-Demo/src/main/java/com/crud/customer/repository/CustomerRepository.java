package com.crud.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
