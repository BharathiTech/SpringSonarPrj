package com.hospital.controller;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Product;

@RestController
@RequestMapping(value = "product")
public class ProductController {
	
	@GetMapping
	public Product a() {
		Product product = new Product();
		BigInteger one = new BigInteger("1");
		product.setId(one);
		product.setName("Brick");
		return product;
	}

}
