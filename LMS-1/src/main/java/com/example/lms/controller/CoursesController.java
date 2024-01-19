package com.example.lms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.lms.model.Courses;
import com.example.lms.service.CoursesService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @GetMapping("/courses")
    public ResponseEntity<List<Courses>> getAllCourses() {
        try {
            List<Courses> courses = coursesService.getAllCourses();
            return ResponseEntity.ok(courses);
        } catch (Exception e) {
            // Log the exception using a logging framework
            // logger.error("Error while fetching all courses", e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
