package com.gpertile.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpertile.course.entities.User;
import com.gpertile.course.repositories.UserRepository;

// para declarar e poder fazer injeção de dependencia
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj =repository.findById(id);
		
		return obj.get();
	}
}
