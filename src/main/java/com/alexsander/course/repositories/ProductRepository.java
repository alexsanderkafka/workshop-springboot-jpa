package com.alexsander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsander.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}