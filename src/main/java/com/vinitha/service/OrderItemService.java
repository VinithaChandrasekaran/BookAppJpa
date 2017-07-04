package com.vinitha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinitha.repository.BookRepository;
import com.vinitha.repository.OrderItemRepository;
import com.vinitha.user.OrderItem;

@Service
public class OrderItemService {



	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private BookRepository bookRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);

}
}
