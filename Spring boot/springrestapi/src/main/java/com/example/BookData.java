package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class BookData {
	
	static List<Book> book=new ArrayList<>();
	static {
		book.add(new Book(12,"FluidMechanics","Bansal"));
		book.add(new Book(20,"Structural analysis","Karthik"));
		book.add(new Book(25,"Strngth Of Material","Jayram"));	
	}
	public List<Book> getAll(){
		
		return book;		
	}
	public Book getById(int id) {
		Book book1 = null;
		try {
			book1=book.stream().filter(e->e.getId()==id).findFirst().get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book1;
	}
	public Book add(Book b) {
		book.add(b);
		return b;
	}
	
	public void delete(int id) {
	book = book.stream().filter(e->e.getId()!=id).collect(Collectors.toList());	
	}
	
	public void update(Book b,int id) {
		
		book=book.stream().map(g->{
			if(g.getId()==id) {
				g.setTitle(b.getTitle());
				g.setAuthor(b.getAuthor());
			}
			return g;
		}).collect(Collectors.toList());
		}
	
}
