package com. example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.Modile;

@Service
public class serviceLayer {
	private final RestTemplate restTemplate = new RestTemplate();
		public Modile getAll() {
				
		return this.restTemplate.getForObject("https://dummyjson.com/products/1", Modile.class);
		
	}

}
