package com.example.lms.exception;

public class UserNotFoundException extends RuntimeException {
	 public UserNotFoundException(int id) {
	        super("Could not find the user with id " + id);
	    }
}
