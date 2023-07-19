package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerrepo;
	@Autowired
	RestTemplate rst;
	
	
	public Customer findCustomertByCode(String id) {
		Optional< Customer> result = customerrepo.findById(id);
		 Customer customer=result.get();
		return customer;
		
	}

	public List<Customer> getAll() {
		return  customerrepo.findAll();
	}

	public void addCustomer(Customer customer) {
		customerrepo.save(customer);
		
	}

	public void deleteCustomer(String id) {
		customerrepo.deleteById(id);
		
	}

	public void updatecustomer(Customer customer) {
		Optional<Customer> result =customerrepo.findById(customer.getC_id());
		result.get().setC_name(customer.getC_name());
		result.get().setC_email(customer.getC_email());
		customerrepo.save(customer);
		
	}

	public ResponseEntity<?> getevent(String id) {
		ResponseEntity  rent = rst.getForEntity("http://localhost:8098/pro/product/{id}",String.class,id);
		return rent;
	}

}
