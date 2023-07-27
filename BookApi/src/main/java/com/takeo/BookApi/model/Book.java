package com.takeo.BookApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int book_id;
	
	private String bookname;

	public Book() {
	
		
	}
	
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	

}
