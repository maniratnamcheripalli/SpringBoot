package com.example.controller;

import java.io.PrintWriter;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dao.Ordertable;
import com.example.entity.Address;
import com.example.entity.Cart;
import com.example.entity.Customer;
import com.example.entity.Products;
import com.example.repository.EcomRepository;
import com.example.repository.InternalUserRepository;
import com.example.service.RegistrationCheck;

@Controller
public class EcomController {

	@Autowired
	private EcomRepository repository;

	@Autowired
	private InternalUserRepository internalRepository;

	@Autowired
	private RegistrationCheck check;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {
		return "Login";
	}

	@RequestMapping("/register")
	public String register(Model model) {
		System.out.println("Register");
		Customer cu = new Customer();
		model.addAttribute("customer", cu);
		return "Register";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			System.out.println("man");

			return "Register";
		}else {

		String save = check.save(customer);
		System.out.println("man1");

		return save;
		}
	}

	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	public String validate(@RequestParam("name") String name, @RequestParam("password") String password,
			HttpServletRequest request, Model model) {
		System.out.println("Login");
		String checkForUser = repository.checkForUser(name, password);
		System.out.println(checkForUser);
		if (checkForUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			List<Products> findAll = internalRepository.findAll();
			model.addAttribute("home", findAll);
			return "redirect:/Home";

		} else {
			return "ValidatingLogindata";

		}

	}

	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();

		return "redirect:/Home";
	}

	@RequestMapping("/Home")
	public String home(Model model) {
		List<Products> findAll = internalRepository.findFromDifferentCategory();
		System.out.println(findAll);
		model.addAttribute("home", findAll);
		return "Home";
	}

	@RequestMapping("/mobile")
	public String mobile(Model model,@PathParam("property") String property) {
		List<Products> findAll = internalRepository.getByProperty(property);
		System.out.println(findAll);
		model.addAttribute("mobile", findAll);

		return "Mobile";

	}

	@RequestMapping("/addCart")
	public String addCart(@PathParam("id") int id, HttpServletRequest request) {
		
		Object username = request.getSession().getAttribute("name");
		if (username != null) {
			check.addCart(id, request);
			
			return "redirect:/MobilePdp?id="+id+"";
		}else {
			return "redirect:/";
		}
		
	}
	
	@RequestMapping("/deleteFromCart")
	public String deleteFromCart(@Param("id") int id) {
		check.deleteFromCart(id);
		return "redirect:/showCart";
		
	}

	@RequestMapping("/showCart")
	public String showCart(Model m, HttpServletRequest request) {
		
		Object username = request.getSession().getAttribute("name");
		if (username != null) {
			String sessionName = request.getSession().getAttribute("name").toString();
			List<Cart> showCart = check.showCart(sessionName);
			m.addAttribute("cartData", showCart);
			return "showCart";
		}else {
			return "redirect:/";
		}
		

	}

	@RequestMapping("/buy")
	public String Booking(@PathParam("id") int id, @PathParam("price") int price, @PathParam("image") String image,
			@PathParam("description") String description, HttpServletRequest request, Model m) {
		System.out.println("Buying");
		Object username = request.getSession().getAttribute("name");
		if (username != null) {
			String email = request.getSession().getAttribute("name").toString();
			check.add(id, image, description, price, email);
			System.out.println(id + " " + price);
			check.deleteFromCart(id);

			return "redirect:/address";
		} else {
			return "redirect:/";
		}
	}

	@RequestMapping("/address")
	public String addressForm() {
		return "AddressForm";
	}

	@RequestMapping("/addressSave")
	public String address(@ModelAttribute("address") Address address) {

		check.addAddress(address);
		return "Home";
	}

	@RequestMapping("/orderList")
	public String showOrderedData(HttpServletRequest request,Model m) {
		String name = request.getSession().getAttribute("name").toString();
		List<Ordertable> orderedData = check.getOrderedData(name);
		m.addAttribute("cartData", orderedData);
		return "orderedList";
	}

	@RequestMapping("/dummy")
	public String dummy() {
		return "dummy";
	}

}
