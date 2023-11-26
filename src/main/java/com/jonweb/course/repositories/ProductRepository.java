package com.jonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
