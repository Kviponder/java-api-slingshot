package com.campusedu.devexercise.exceptions;

 // Custom exception class for course not found errors in the CourseService.
public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String message){
        super(message);
    }
}
