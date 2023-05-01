package com.alexsander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsander.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}