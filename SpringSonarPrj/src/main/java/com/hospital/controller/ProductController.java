package com.hospital.controller;

import java.math.BigInteger;
import java.util.Random;

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
		product.setId(new BigInteger(1,new Random()));
		product.setName("Brick");
		return product;
	}

}
