package com.takeo.BookApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.BookApi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
}
