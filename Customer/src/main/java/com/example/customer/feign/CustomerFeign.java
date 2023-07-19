package com.example.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

@FeignClient(name="Product")
public interface CustomerFeign {

	@GetMapping("/pro/products")
	ResponseEntity<?> getProducts();

	
}
