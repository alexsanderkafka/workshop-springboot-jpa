package com.alexsander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsander.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}