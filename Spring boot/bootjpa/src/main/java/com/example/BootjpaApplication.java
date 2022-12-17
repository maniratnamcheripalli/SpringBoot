package com.example;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.UserRepository;
import com.example.entites.User;

@SpringBootApplication
public class BootjpaApplication {

	private static Optional<User> optional;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootjpaApplication.class, args);
		UserRepository bean = run.getBean(UserRepository.class);
		User user=new User();
//		user.setId(15);
//		user.setName("Mani");
//		user.setCity("Hyderabad");
		
		//For saving single user
		
//		User save = bean.save(user);
		
		//CREATE
		
//		user.setName("Rahul");
//		user.setCity("Hyderabad");
//		
//		User user1=new User();
//		user1.setName("Srikanth");
//		user1.setCity("Hyderabad");
//		
//		List<User> of = List.of(user,user1);
//		Iterable<User> result = bean.saveAll(of);
//		result.forEach(users->System.out.println(users));
//		System.out.println("Done");
		
		
//		//UPDATE
//		
//		Optional<User> optional = bean.findById(3);
//		User user3 = optional.get();
//		user3.setName("Srikanth");
//		bean.save(user3);
//		
//		Optional<User> optional1 = bean.findById(5);
//		User user4 = optional1.get();
//		user4.setName("Vinay");
//		bean.save(user4);
//		
//		
//		//Read
//		
//	optional = bean.findById(3);
//	User user2 = optional.get();
//	System.out.println(user2);
//	
//	
//	Iterable<User> findAll = bean.findAll();
//
//	findAll.forEach(use->System.out.println(use));
//	
//	
//	//DELETE
//	
//	
//	bean.deleteById(4);
		
		List<User> findByName = bean.findByName("Srikanth");
		findByName.forEach(use->System.out.println(use));		
		List<User> allUser = bean.getAllUser();
		allUser.forEach(all->System.out.println(all));
		
		System.out.println("*************************");
		
		User byId = bean.getById("Mani");
		System.out.println(byId);
	}

}
