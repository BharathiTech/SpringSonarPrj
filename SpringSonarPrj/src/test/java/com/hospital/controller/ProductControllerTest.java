package com.hospital.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest{
	@Test
	void contextLoads() {
	} 
	
	/*
	 * @Autowired private WebApplicationContext webApplicationContext;
	 */
	
	@Autowired
	MockMvc mockMvc;
	
	/*
	 * @Before public void setUp() { mockMvc =
	 * MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); }
	 */

	@Test
	void testA() throws Exception {
		mockMvc.perform(get("/product")).
		andExpect(status().isOk()).
		andExpect(content().contentType(MediaType.APPLICATION_JSON)).
		andExpect(jsonPath("$.name").value("Brick"));
	
	}

}
