package com.alexsander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsander.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}