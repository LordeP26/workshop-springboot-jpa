package com.pedrolima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolima.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
