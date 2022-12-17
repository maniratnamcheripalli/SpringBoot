package com.example.service;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Ordertable;
import com.example.entity.Address;
import com.example.entity.Cart;
import com.example.entity.Customer;
import com.example.entity.Products;
import com.example.repository.AddressRepository;
import com.example.repository.CartRepository;
import com.example.repository.EcomRepository;
import com.example.repository.InternalUserRepository;
import com.example.repository.OrderRepository;

@Service
public class RegistrationCheck {

	@Autowired
	private EcomRepository repository;

	@Autowired
	private InternalUserRepository internalRepository;

	@Autowired
	private CartRepository cart;

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private OrderRepository order;

	public String save(Customer customer) {
		String save = repository.add(customer.getMailId());

		if (save != null) {
			return "AllReadyRegistered";

		} else {
			repository.save(customer);
			return "redirect:/";

		}
	}

	public void addCart(int id, HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<Products> findById = internalRepository.getProductDetailsById(id);
		System.out.println(findById);
		Cart c = new Cart();
		c.setId(findById.get(0).getId());
		c.setImage(findById.get(0).getImage());
		c.setUsername(session.getAttribute("name").toString());
		c.setDescription(findById.get(0).getDescription());
		c.setPrice(findById.get(0).getPrice());
		cart.save(c);

	}

	public List<Cart> showCart(String name) {

		List<Cart> findAll = cart.findByName(name);
		return findAll;
	}

	public String add(int id, String image, String description, int price, String email) {
		Ordertable or=new Ordertable();
		or.setId(id);
		or.setImage(image);or.setPrice(price);or.setDescription(description);or.setUsername(email);
		order.save(or);
		return null;
	}

	public void addAddress(Address address) {
		addressRepo.save(address);

	}

	public void deleteFromCart(int id) {
		cart.deleteById(id);
	}

	public List<Ordertable> getOrderedData(String name) {
		System.out.println(name);
		List<Ordertable> findByName = order.findByName(name);

		return findByName;
	}

}
