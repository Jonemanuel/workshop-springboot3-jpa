package com.jonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
