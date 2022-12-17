package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${insurance.provider.url:}")
	private String url;
	
	@GetMapping("/allPlans")
	public List<String> getPlans(){
		
		  List<String> forObject = restTemplate.getForObject(url, List.class);
		  return forObject;
	}

}
