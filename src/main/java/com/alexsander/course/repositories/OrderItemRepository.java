package com.alexsander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsander.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}