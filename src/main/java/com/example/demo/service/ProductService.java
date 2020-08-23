package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductSeller;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> productsByCriteria(String key ,String value) throws Exception{
		return productRepository.productsByCriteria(key, value);
	}
	
	public List<Product> productsBySKU(int value) throws Exception{
		return productRepository.productsBySKU(value);
	}
	
	public List<ProductSeller> groupProductsBySeller() throws Exception{
		return productRepository.groupProductsBySeller();		
	}
	
}
