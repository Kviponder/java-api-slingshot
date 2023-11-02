package com.campusedu.devexercise.exceptions;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String message){
        super(message);
    }
}
