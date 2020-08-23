package com.example.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int arg1) throws SQLException {
		Product product = new Product();
		product.setVariantId(rs.getInt("variant_id"));
		product.setProductId(rs.getInt("product_id"));
		product.setSize(rs.getString("size"));
		product.setBrand(rs.getString("brand"));
		product.setColor(rs.getString("color"));
		product.setSeller(rs.getString("seller"));
		product.setPrice(rs.getDouble("price"));
		product.setSku(rs.getInt("sku"));
		return product;
	}	
}
