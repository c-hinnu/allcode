package com.example.customer.controller;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.feign.CustomerFeign;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("/cust")
public class CustomerController {
@Autowired
private CustomerService customerservice;
@Autowired
private CustomerFeign cf;
//feign
@GetMapping("/product") 
public ResponseEntity<?>getAll()
{ 
return cf.getProducts();
}
//Rest Template with circuit breaker
@GetMapping("/product/{id}")
@CircuitBreaker(name="aaa",fallbackMethod="fallback1")
@RateLimiter(name="aaa")
public ResponseEntity<?>getByid(@PathVariable String id)
{
	return customerservice.getevent(id);
}

public ResponseEntity<?> fallback1(Throwable t)
{
return ResponseEntity.status(HttpStatus.SC_ACCEPTED).body("Fallback response");
}

@GetMapping("/customer/{id}")
public Customer getproduct(@PathVariable String id) {
	
	Customer customer= customerservice.findCustomertByCode(id);	
			
	return customer;
}

@GetMapping("/customers")
public List<Customer> getAllcustomer() {
	
List <Customer> c= customerservice.getAll();	
			
	return c; 
}
@PostMapping("/customer")
public Customer createcustomer(@RequestBody Customer customer) {
	
	customerservice.addCustomer(customer);
			
	return customer;		
	
}
@DeleteMapping("/customer/{id}")
public void deleteCustomer(@PathVariable String id) {
	
	customerservice.deleteCustomer(id);
	
}
@PutMapping("/product/{id}") 
public Customer updateCustomer(@RequestBody Customer customer ) {
	
	customerservice.updatecustomer(customer) ;
			
	return customer;
}
//circuitbreaker
@GetMapping("/string")
@CircuitBreaker(name="aaa",fallbackMethod="fallback2")
@RateLimiter(name="aaa")
public String GetString()
{
	return "hello";
}
public String fallback2(Throwable t)
{
return "fallback ";
}


}
