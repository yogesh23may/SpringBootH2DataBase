package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRowMapper;
import com.example.demo.model.ProductSeller;
import com.example.demo.model.ProductSellerRowMapper;

@Repository
public class ProductRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Product> productsByCriteria(String key ,String value) throws Exception{
		return jdbcTemplate.query("select * from products_variants where "+key +"="+"'"+value+"'", new ProductRowMapper());		
	}	
	
	public List<Product> productsBySKU(int value) throws Exception{
		return jdbcTemplate.query("select * from products_variants where sku"+"="+"'"+value+"'", new ProductRowMapper());		
	}
	
	public List<ProductSeller> groupProductsBySeller() throws Exception{
		return jdbcTemplate.query("select seller,count(*) as count from products_variants group by seller", new ProductSellerRowMapper());		
	}	
}
