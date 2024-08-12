package com.crud.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.customer.DTO.CustomerDTO;
import com.crud.customer.model.Customer;

@Service
public interface CustomerService {


	public ArrayList<Customer> saveAllCustomers(List<CustomerDTO> customersDTO);

	public List<CustomerDTO> getAllCustomers();

	public CustomerDTO getCustomerbyId(Integer id);

	public CustomerDTO updateProduct(Integer id, String customerName);

	public String deleteCustomer(int id);


	
}
