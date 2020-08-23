package com.example.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.config.TestConfiguration;
import com.example.demo.model.Product;
import com.example.demo.model.ProductSeller;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = TestConfiguration.class )
public class ProductServiceTest {

	@Autowired
	private ProductService productService;

	@Test
	public void getProductsByCriteria() throws Exception{
		List<Product> products = productService.productsByCriteria("color", "black");
		assertNotNull(products);
		for(Product product : products){			
			System.out.println(product);
			assertEquals("color", product.getColor());
		}
	}

	@Test
	public void getProductsBySKU() throws Exception{
		List<Product> products = productService.productsBySKU(1000);
		assertNotNull(products);
		for(Product product : products){			
			System.out.println(product);
			assertEquals(1000, product.getSku());
		}	
	}

	@Test
	public void groupProductsBySeller() throws Exception{
		List<ProductSeller> groupProductsBySellerList = productService.groupProductsBySeller();
		assertNotNull(groupProductsBySellerList);		
		for(ProductSeller productSeller : groupProductsBySellerList){
			System.out.println(productSeller);
			assertTrue(productSeller.getCount()>0);
		}
	}

}
