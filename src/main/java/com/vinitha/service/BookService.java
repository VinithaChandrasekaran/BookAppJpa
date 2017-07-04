package com.vinitha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinitha.repository.BookRepository;
import com.vinitha.user.Book;



@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	
	public List<Book> findAll()
	{
		return bookRepository.findAll();
	}
		public Book findOne(int id)
		{
			return bookRepository.findOne(id);
		}
		

	
		
	
}

