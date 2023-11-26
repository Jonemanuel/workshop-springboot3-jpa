package com.jonweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonweb.course.entities.Order;
import com.jonweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findALL(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		repository.findById(id);
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
