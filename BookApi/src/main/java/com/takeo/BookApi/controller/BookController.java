package com.takeo.BookApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.BookApi.model.Book;
import com.takeo.BookApi.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	private final BookService bookserv;

	@Autowired
	public BookController(BookService bookserv) {
		this.bookserv = bookserv;
	}
	
	@GetMapping("/allbooks")
	public List<Book> getAllBooks()
	{
		return bookserv.getAllBooks();
	}

	
	
}
