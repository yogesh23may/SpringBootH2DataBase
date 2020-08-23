package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ExceptionResponse;
import com.example.demo.model.Product;
import com.example.demo.model.ProductSeller;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/groupBy/{key}/{value}", method = RequestMethod.GET)
	public ResponseEntity<?> productsByCriteria(@PathVariable("key") String key,@PathVariable("value") String value) throws Exception {   
		List<Product> products = productService.productsByCriteria(key, value);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/sku/{value}", method = RequestMethod.GET)
	public ResponseEntity<?> productsBySKU(@PathVariable("value") int value) throws Exception {   
		List<Product> products = productService.productsBySKU(value);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/perSeller", method = RequestMethod.GET)
	public ResponseEntity<?> productsPerSeller() throws Exception {   
		List<ProductSeller> productsBySeller = productService.groupProductsBySeller();
		return new ResponseEntity<>(productsBySeller, HttpStatus.OK);
	}

	@ExceptionHandler(value = Exception.class)  
	public ResponseEntity<?> handlingException(Exception exception){  
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
		exceptionResponse.setErrorMessage(exception.getMessage());
		exceptionResponse.setExceptionHandlingLevel("controller-level");
		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_FOUND);
	}	
}


