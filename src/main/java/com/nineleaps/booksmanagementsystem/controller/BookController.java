package com.nineleaps.booksmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.booksmanagementsystem.entity.Book;
import com.nineleaps.booksmanagementsystem.service.IBookService;

@RestController
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@PostMapping("/insertbooks")
	public Book insertBook(@RequestBody Book newBook) {
		return bookService.insertBook(newBook);
		
	}
}

