package com.campusedu.devexercise.exceptions;

public class CourseServiceException extends RuntimeException {
    public CourseServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
