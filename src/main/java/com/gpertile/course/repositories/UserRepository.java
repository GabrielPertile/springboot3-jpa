package com.gpertile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpertile.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
