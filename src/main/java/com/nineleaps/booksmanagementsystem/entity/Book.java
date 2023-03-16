package com.nineleaps.booksmanagementsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="bookid")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long bookId;
	@Column(name="bookname",nullable = false)
	private String bookName;
	@Column(name="bookauthor",nullable = false)
	private String bookAuthor;
	@Column(name="bookprice",nullable = false)
	private Long bookPrice;
	@Column(name="booktotalquantity",nullable = false)
	private Long bookTotalQuantity;
	
	
	public Book(Long bookId, String bookName, String bookAuthor, Long bookPrice,
			Long bookTotalQuantity, Admin admin, Customer customer) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookTotalQuantity = bookTotalQuantity;
	}

	public Long getBookTotalQuantity() {
		return bookTotalQuantity;
	}

	public void setBookTotalQuantity(Long bookTotalQuantity) {
		
		this.bookTotalQuantity = bookTotalQuantity;
		}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="admin_id")
	private Admin admin;
	
	public Book(Long bookId, String bookName, String bookAuthor, String bookType, Long bookPrice, Admin admin,
			Customer customer) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.admin = admin;
		this.customer = customer;
		
	}



	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthorName() {
		return bookAuthor;
	}

	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthor = bookAuthorName;
	}

	public Long getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Book(Long bookId, String bookName, String bookAuthor, String bookType, Long bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	
}
