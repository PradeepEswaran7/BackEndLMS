package com.example.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lms.model.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {
    // You don't need a custom query to fetch all courses
    // You can use the inherited findAll() method
    // public Iterable<Courses> getAllCourses();
}



