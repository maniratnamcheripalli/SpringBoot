package com.example.controller;

import java.util.List;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Products;
import com.example.repository.EcomRepository;
import com.example.repository.InternalUserRepository;

@Controller
public class InternalUser {

	
	
	@Autowired
	private InternalUserRepository repo;

	@RequestMapping("/mobileAdd")
	public String productDescription(Model model) {

		Products mo = new Products();
		model.addAttribute("mobile", mo);
		return "InternalMobile";
	}

	@RequestMapping(value = "/mobile",method = RequestMethod.POST)
	public String addMobile(@ModelAttribute("mobile") Products mobile) {
		repo.save(mobile);
		
		return "redirect:/mobilepdp";
	}
	
	
	@RequestMapping("/MobilePdp")
	public String productDescription(@PathParam("id") int id, Model model) {
		List<Products> productDetailsById = repo.getProductDetailsById(id);
		model.addAttribute("mobilepdp",productDetailsById);
		return "MobilePdp";
	}
}
