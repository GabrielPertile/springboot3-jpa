package com.gpertile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpertile.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
