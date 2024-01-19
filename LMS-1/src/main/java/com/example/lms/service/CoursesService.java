package com.example.lms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lms.dao.CoursesRepository;
import com.example.lms.model.Courses;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }
}
