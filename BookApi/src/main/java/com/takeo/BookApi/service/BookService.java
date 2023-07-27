package com.takeo.BookApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takeo.BookApi.model.Book;
import com.takeo.BookApi.repo.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookrepo;

	@Autowired
	public BookService(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	
	public List<Book> getAllBooks()
	{
		return bookrepo.findAll();
		
	}
	
	public Book getBookById(Integer id)
	{
		return bookrepo.findById(id).orElse(null);
		
	}
	
	public Book createBook(Book b1)
	{
		return bookrepo.save(b1);
	}
	
	
	
	public Book updateBook(Integer id, Book book)
	{
		Book existingbook=bookrepo.findById(id).orElse(null);
		
		if(existingbook!=null)
		{
			existingbook.setBookname(book.getBookname());
			return bookrepo.save(existingbook);
		}
		
		return null;
	}
	
	
	public void deleteBook(Integer id)
	{
		bookrepo.deleteById(id);
	}
	
	
	
	
	
	
	

}
