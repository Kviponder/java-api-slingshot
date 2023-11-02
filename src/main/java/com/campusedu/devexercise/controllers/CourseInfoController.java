package com.campusedu.devexercise.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusedu.devexercise.model.Course_Info;
import com.campusedu.devexercise.services.CourseService;
import com.campusedu.devexercise.exceptions.CourseNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courseInfo")
public class CourseInfoController {

    private final CourseService courseService;

    @Autowired
    public CourseInfoController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<Course_Info>> getCourseInfo(@RequestParam(required = false) String courseCodePrefix,
                                                          @RequestParam(required = false) String courseCodeNumber) {
        try {
            List<Course_Info> courseInfos = courseService.findByCourseCodePrefixAndCourseCodeNumber(courseCodePrefix, courseCodeNumber);
            return ResponseEntity.ok(courseInfos);
        } catch (CourseNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }


}
