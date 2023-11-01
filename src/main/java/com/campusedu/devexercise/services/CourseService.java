package com.campusedu.devexercise.services;

import com.campusedu.devexercise.model.Course_Info;
import com.campusedu.devexercise.repository.CourseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CourseService {
    private final CourseInfoRepository courseInfoRepository;
@Autowired
    public CourseService(CourseInfoRepository courseInfoRepository) {
        this.courseInfoRepository = courseInfoRepository;
    }

    public List<Course_Info> findByCourseCodePrefixAndCourseCodeNumber(String courseCodePrefix, String courseCodeNumber) throws Exception {
        List<Course_Info> coursesByPrefix = courseCodePrefix !=null ?
                courseInfoRepository.findByCourseCodePrefix(courseCodePrefix) : List.of();

        List<Course_Info>courseByNumber = courseCodeNumber !=null ?
                courseInfoRepository.findByCourseCodeNumber(courseCodeNumber) : List.of();

        return Stream.concat(coursesByPrefix.stream(), courseByNumber.stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
