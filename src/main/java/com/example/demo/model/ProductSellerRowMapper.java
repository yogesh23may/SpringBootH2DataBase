package com.example.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductSellerRowMapper implements RowMapper<ProductSeller>{

	@Override
	public ProductSeller mapRow(ResultSet rs, int arg1) throws SQLException {
		ProductSeller productSeller = new ProductSeller();
		productSeller.setSellerName(rs.getString("seller"));
		productSeller.setCount(rs.getInt("count"));
		return productSeller;
	}	
}
