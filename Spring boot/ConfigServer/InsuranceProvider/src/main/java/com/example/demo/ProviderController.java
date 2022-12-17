package com.example.demo;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance-provider")
public class ProviderController {

	@GetMapping("/getAllPlans")
	public List<String> getAllPlans(){
		return Stream.of("Silver","Gold","platinum").collect(Collectors.toList());
	}
}
