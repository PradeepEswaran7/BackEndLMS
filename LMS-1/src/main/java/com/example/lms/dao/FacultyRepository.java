package com.example.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lms.model.Faculty;
import com.example.lms.model.User;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
    @Query("SELECT f FROM Faculty f WHERE f.email = ?1")  // Corrected method name
    Faculty findByEmail(String email);
}
