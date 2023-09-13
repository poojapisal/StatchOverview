package com.erp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.main.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	public User finduserId(int userId);
}
