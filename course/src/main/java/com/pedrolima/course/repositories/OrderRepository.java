package com.pedrolima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolima.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
