package com.gpertile.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpertile.course.entities.Product;
import com.gpertile.course.repositories.ProductRepository;

// para declarar e poder fazer injeção de dependencia
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj =repository.findById(id);
		
		return obj.get();
	}
}
