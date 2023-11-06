package com.campusedu.devexercise.exceptions;



// Custom exception class for service-related errors in the CourseService.

public class CourseServiceException extends RuntimeException {
    public CourseServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
