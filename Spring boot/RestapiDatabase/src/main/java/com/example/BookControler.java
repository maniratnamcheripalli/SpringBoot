package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControler {
	
	@Autowired
	public Database db;
	
	@PostMapping("/book")
	public Book save(@RequestBody Book book) {
		Book save = db.save(book);
		
		return save;
		
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> get(@PathVariable("id") int id) {
		ResponseEntity<Book> read = db.read(id);
		return read;
		
	}
	
	@GetMapping("/books")
	public List<Book> getAll() {
		List<Book> all = db.getAll();
		return all;
		
	}
	
	@DeleteMapping("/books/{id}")
	public void delete(@PathVariable("id") int id) {
		db.delete(id);
	}
	
	@PutMapping("/books/put/{id}")
	public void put(@RequestBody Book book ,@PathVariable("id") int id) {
		
		db.put(book, id);
		
	}
	@PatchMapping("/books/patch/{id}")
	public void patch(@RequestBody Book book ,@PathVariable("id") int id) {
		
		db.patch(book, id);
		
	}
	
	

}
