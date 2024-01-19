package com.example.lms.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.lms.dao.UserRepository;
import com.example.lms.exception.UserNotFoundException;
import com.example.lms.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user) {
        try {
            user.setRole("student");
            userRepository.save(user);
            return "Registration successful!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Registration unsuccessful!";
        }
    }


    public String loginUser(User user) {
        try {
            User existingUser = userRepository.findByEmail_Address(user.getEmail_Address());

            if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
                // Login successful
                return "Login successful!";
            } else {
                // User not found or incorrect password
                return "Invalid credentials!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Login unsuccessful!";
        }
    }
    
    public List<User> getAllUsers() {
    	return userRepository.findAll();
    }
    
    
    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException((int) id));
    }
    
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
    
    public User updateUser(User user, int id) {
    	user.setStd_id(id);
		return this.userRepository.save(user);
	}
    
    public Map<String, Object> getStdIdAndNameByEmail(String email) {
        User user = userRepository.findByEmail_Address(email);
        Map<String, Object> result = new HashMap<>();

        if (user != null) {
            result.put("std_id", user.getStd_id());
            result.put("full_Name", user.getFull_Name());
        } else {
            result.put("std_id", -1); // or some default value
            result.put("full_Name", null); // or some default value
        }

        return result;
    }
    public boolean isEmailUnique(String email) {
        // Add logic to check if the email is unique in the database
        // You can use userRepository.findByEmail_Address(email) and return true if it's not found
        // or add any other logic based on your database structure
        return userRepository.findByEmail_Address(email) == null;
    }
}