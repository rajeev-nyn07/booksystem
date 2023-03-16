package com.nineleaps.booksmanagementsystem.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.booksmanagementsystem.entity.Book;
import com.nineleaps.booksmanagementsystem.entity.Cart;
import com.nineleaps.booksmanagementsystem.entity.Customer;
import com.nineleaps.booksmanagementsystem.entity.Payment;
import com.nineleaps.booksmanagementsystem.repository.CartRepository;


@Service

public class CartServiceImpl implements ICartService {

	@Autowired
	private CartRepository cartRepository;
	
	
	
	
	@Autowired
	private ICustomerService customerServices;
	
	@Autowired
	private IBookService bookServices;
		
	@Autowired
	private IPaymentService paymentServices;
	
	@Autowired		
	private IOrderService orderServices;
	
	public Long findByBookId(Long bookid,Long customerId) {
		
		Book book = bookServices.getBookById(bookid);
	    Long bookTotalQuantity=book.getBookTotalQuantity();
		Long bookPrice=book.getBookPrice();
		Long finalBookPrice=(long) (bookPrice*0.05+bookPrice);
		Customer customer=customerServices.getCustomerById(customerId);
		Long cartId = (long) (Math.random()*100);
		Cart cart=new Cart(cartId,finalBookPrice,book,customer);
		Long cartIdMain=cart.getCartId();
		Payment payment=new Payment(cartIdMain,"success",cart);
        Long walletAmt=customer.getCustomerWallet();
		if(walletAmt>finalBookPrice) {
			paymentServices.insertPayment(payment);
			book.setBookTotalQuantity(bookTotalQuantity-1);
			bookServices.updateBook(bookid, book);
			Long updatedWalletAmt=walletAmt-finalBookPrice;
		if(updatedWalletAmt>0)
			customer.setCustomerWallet(updatedWalletAmt);
		
		else
			customer.setCustomerWallet(0l);
		}
		customerServices.insertCustomer(customer);
		
		return finalBookPrice;
	}
	
	
	

}

