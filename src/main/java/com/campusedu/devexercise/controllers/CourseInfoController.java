package com.campusedu.devexercise.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusedu.devexercise.model.Course_Info;
import com.campusedu.devexercise.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courseInfo")
public class CourseInfoController {

    private final CourseService courseService;

    @Autowired 

}
