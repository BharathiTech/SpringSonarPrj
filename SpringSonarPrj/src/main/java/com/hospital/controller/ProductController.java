package com.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Product;

@RestController
@RequestMapping(value = "product")
public class ProductController {
	
	@GetMapping
	public Product a() {
		return new Product();
	}

}
