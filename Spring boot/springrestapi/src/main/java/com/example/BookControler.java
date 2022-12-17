package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	private BookData bookData;
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAll(){
		
		List<Book> all = bookData.getAll();
		if(all.size()<=0) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(all));
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getById(@PathVariable("id") int id){
		Book byId = bookData.getById(id);
		if(byId==null) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		return ResponseEntity.of(Optional.of(byId));
	}
	
	@PostMapping("/books")
	public Book add(@RequestBody Book book) {
		Book add = bookData.add(book);
		return add;
	}
	
	@DeleteMapping("/books/{id}")
	public void remove(@PathVariable("id") int id) {
		bookData.delete(id);
	}
	
	@PutMapping("/book/patch/{id}")
	public void update(@RequestBody Book b, @PathVariable("id") int id) {
		bookData.update(b, id);
	}
	
	
	
	
}
