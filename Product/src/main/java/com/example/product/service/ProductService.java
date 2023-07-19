package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productrepo;

	public Product findProductByCode(String id) {
		Optional<Product> result = productrepo.findById(id);
		Product product=result.get();
		return product;
	}

	public List<Product> getAll() {
	return  productrepo.findAll();
		
	}

	public void addProduct(Product product) {
		productrepo.save(product);
		
	}

	public void deleteProduct(String id) {
		
		productrepo.deleteById(id);
	}

	public void updateProduct(Product product) {
		Optional<Product> result = productrepo.findById(product.getP_id());
		result.get().setP_name(product.getP_name());
		result.get().setP_price(product.getP_price());
		productrepo.save(product);
		
	}

}
