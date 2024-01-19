package com.example.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lms.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	@Query("SELECT u FROM User u WHERE u.email_Address = ?1")
	User findByEmail_Address(String email_Address);
}