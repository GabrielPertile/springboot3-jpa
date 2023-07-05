package com.gpertile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpertile.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
