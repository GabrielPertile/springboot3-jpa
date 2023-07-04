package com.gpertile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpertile.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
