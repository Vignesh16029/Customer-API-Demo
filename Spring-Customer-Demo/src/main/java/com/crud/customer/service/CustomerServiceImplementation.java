package com.crud.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.customer.DTO.CustomerDTO;
import com.crud.customer.model.Customer;
import com.crud.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	
	@Autowired 
	CustomerRepository customerRepo;

	//Adding Multiple Customers
	@Override
	public ArrayList<Customer> saveAllCustomers(List<CustomerDTO> customerDTOs) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		for(CustomerDTO customerDTO:customerDTOs) {
		Customer customer = new Customer();
		customer.setAddress(customerDTO.getAddress());
		customer.setAge(customerDTO.getAge());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setDateofBirth(customerDTO.getDateofBirth());
		customer.setEmailId(customerDTO.getEmailId());
		customer.setMobileNumber(customerDTO.getMobileNumber());
		customer.setTotalSpendings(customerDTO.getTotalSpendings());
		customer.setYearsasCustomer(customerDTO.getYearsasCustomer());
		
		customerRepo.save(customer);
		
		}
		return customers;
		
	}

	//Get All CustomersDTOs
	@Override
	public List<CustomerDTO> getAllCustomers() {
		List<CustomerDTO> customerDTOs = new ArrayList<CustomerDTO>();
		List<Customer> customers =customerRepo.findAll();
		
		for(Customer c: customers) {
			CustomerDTO customerDTO = new CustomerDTO();
			
			customerDTO.setAddress(c.getAddress());
			customerDTO.setAge(c.getAge());
			customerDTO.setCustomerName(c.getCustomerName());
			//customerDTO.setDateofBirth(c.getDateofBirth());
			//customerDTO.setEmailId(c.getEmailId());
			customerDTO.setMobileNumber(c.getMobileNumber());
			//customerDTO.setTotalSpendings(c.getTotalSpendings());
			customerDTO.setYearsasCustomer(c.getYearsasCustomer());
			
			customerDTOs.add(customerDTO);
		}
		return customerDTOs;
	}	

	//Update Customer Name
	@Override
	public CustomerDTO updateProduct(Integer id, String customerName) {
		CustomerDTO updateDTO = new CustomerDTO();
		Customer customer = customerRepo.findById(id).orElse(null);
		if(customer != null) {
			customer.setCustomerName(customerName);
			customerRepo.save(customer);
			updateDTO.setCustomerName(customer.getCustomerName());
		}
		return updateDTO;
	}

	//Delete a Customer
	@Override
	public String deleteCustomer(int id) {
		Customer delete = customerRepo.findById(id).orElse(null);
		if(customerRepo.existsById(id)) {
			customerRepo.deleteById(id);
		
		}
		return "Deleted Sucessfully";
	}

	//Get Customer by Id
	@Override
	public CustomerDTO getCustomerbyId(Integer id) {
		CustomerDTO customerDTO = new CustomerDTO();
		Customer customer = customerRepo.findById(id).orElse(null);
		if(customer!=null) {
			customerDTO.setCustomerName(customer.getCustomerName());
			customerDTO.setAge(customer.getAge());
			customerDTO.setAddress(customer.getAddress());
			customerDTO.setDateofBirth(customer.getDateofBirth());
			customerDTO.setEmailId(customer.getEmailId());
			//customerDTO.setMobileNumber(customer.getMobileNumber());
			//customerDTO.setTotalSpendings(customer.getTotalSpendings());
			customerDTO.setYearsasCustomer(customer.getYearsasCustomer());
		}
		
		return customerDTO;
	}
	
	


	


	
	
	
	
	
	
	
	
	
	
	

}
