package com.example;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Database {

	@Autowired
	public BookRepository bookRepository;

	public Book save(Book b) {
		Book save = bookRepository.save(b);
		return save;

	}

	public ResponseEntity<Book> read(int id) {

		Book save = bookRepository.findById(id);
		try {
			if (save == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.of(Optional.of(save));

	}

	public List<Book> getAll() {
		Iterable<Book> findAll = bookRepository.findAll();
		return (List<Book>) findAll;
	}

	public void delete(int id) {
		bookRepository.deleteById(id);
	}

	public void put(Book b, int id) {
		bookRepository.save(b);

	}

	public void patch(Book b, int id) {
		bookRepository.save(b);

	}

}
