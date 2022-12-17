package com.example.util;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Citizen;

@FeignClient(name = "user-detail", url = "http://localhost:8080")
public interface FeignService {

	@GetMapping("name")
	String name();

	@GetMapping("state")
	String state();

	@GetMapping("get")
	List<Citizen> getAll();
}
