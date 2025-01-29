package com.pedrolima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolima.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
