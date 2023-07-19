package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/pro")

public class ProductController {
	@Autowired 
	private ProductService productservice;
	
	@GetMapping("/product/{id}")
	public Product getproduct(@PathVariable String id) {
		
		Product product= productservice.findProductByCode(id);	
				
		return product;
	}
	@GetMapping("/products")
	public List<Product> getAllproduct() {
		
	List <Product> p= productservice.getAll();	
				
		return p; 
	}
	@PostMapping("/product")
	public Product createproduct(@RequestBody Product product) {
		
		productservice.addProduct(product);
				
		return product;		
		
	}
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable String id) {
		
		productservice.deleteProduct(id);
		
	}
	@PutMapping("/product/{id}") 
	public Product updateProduct(@RequestBody Product product ) {
		
		productservice.updateProduct(product) ;
				
		return product;
	}
	

}
