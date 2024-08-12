package com.crud.customer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.customer.DTO.CustomerDTO;
import com.crud.customer.model.Customer;
import com.crud.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired 
	CustomerService customerService;
	//Adding Multiple CustomersDTO
	@PostMapping("/create/customer")
	public ResponseEntity<String> addCustomer (@RequestBody List<CustomerDTO> customersDTO) {
		List<Customer> addedCustomers = customerService.saveAllCustomers(customersDTO);
		return new ResponseEntity<>("Customer Data Saved Sucessfully", HttpStatus.CREATED) ;
		
	}
	
	//Display All Customers
	@GetMapping("/get/customer/list")
	public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
		List<CustomerDTO> customersDTO = customerService.getAllCustomers();
		return ResponseEntity.ok(customersDTO);
		
	}
	//Get Customer by idDTO
	@GetMapping("/get/cutomer/{id}")
	public ResponseEntity<CustomerDTO> getCustomerbyId(@PathVariable Integer id){
		CustomerDTO customerDTO = customerService.getCustomerbyId(id);
		return new ResponseEntity<> (customerDTO, HttpStatus.OK);
		
	}
	//Update Customer
	@PutMapping("/update/customer/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer id, @RequestBody String customerName){
		CustomerDTO updatedCustomer = customerService.updateProduct(id, customerName);
		return new ResponseEntity<> ("Data Updated Sucessfully", HttpStatus.OK);
		
	}
	//Delete Customer
	@DeleteMapping("/delete/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id){
		String deletedCustomer = customerService.deleteCustomer(id);
		return new ResponseEntity<> ("Customer Deleted Sucessfully", HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
