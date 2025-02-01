package com.pedrolima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolima.course.entities.OrderItem;
import com.pedrolima.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{ //nesse repositorie tem que usar a chave composta no lugar do long

}
