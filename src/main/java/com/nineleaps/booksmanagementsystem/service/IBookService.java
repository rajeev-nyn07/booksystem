package com.nineleaps.booksmanagementsystem.service;

import java.util.List;

import com.nineleaps.booksmanagementsystem.entity.Book;

public interface IBookService {
	public List<Book> getAllBooks();
	public Book getBookById(Long bookId);
	public void deleteBook(Long bookId);
	public Book insertBook(Book newBook);
	public Book updateBook(Long bookId,Book updatedBook);
	public Book findByBookName(String bookName);
	public Long bookTotalQuantity(Long bookId);
}
