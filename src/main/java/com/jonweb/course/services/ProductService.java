package com.jonweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonweb.course.entities.Product;
import com.jonweb.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findALL(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		repository.findById(id);
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
