package com.pedrolima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolima.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
