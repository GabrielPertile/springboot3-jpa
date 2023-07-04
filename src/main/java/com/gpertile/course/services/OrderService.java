package com.gpertile.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpertile.course.entities.Order;
import com.gpertile.course.repositories.OrderRepository;

// para declarar e poder fazer injeção de dependencia
@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =repository.findById(id);
		
		return obj.get();
	}
}
