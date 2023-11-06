package com.campusedu.devexercise.services;

import com.campusedu.devexercise.model.Course_Info;
import com.campusedu.devexercise.repository.CourseInfoRepository;
import com.campusedu.devexercise.exceptions.CourseServiceException;
import com.campusedu.devexercise.exceptions.CourseNotFoundException;
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

    /**
     * Get a List of all Courses
     *
     * @return Lists all of the course_info objects, ie class data
     */

    public List<Course_Info> getAllCourses() {
        return courseInfoRepository.findAll();
    }

    /**
     * Get a list of courses based on courseCodePrefix and courseCodeNumber.
     * @param courseCodePrefix The prefix of the course ie: EDU.
     * @param courseCodeNumber The code number of the course ie: 101.
     * @return List of course objects matching the prefix and/or number.
     * @throws CourseNotFoundException If no courses match the input criteria..
     * @throws CourseServiceException If an unexpected error occurs while retrieving course data.
     *
     */
    public List<Course_Info> findByCourseCodePrefixAndCourseCodeNumber(String courseCodePrefix, String courseCodeNumber) {
        try {
            List<Course_Info> coursesByPrefix = courseCodePrefix != null ?
                    courseInfoRepository.findByCourseCodePrefix(courseCodePrefix) : List.of();

            List<Course_Info> courseByNumber = courseCodeNumber != null ?
                    courseInfoRepository.findByCourseCodeNumber(courseCodeNumber) : List.of();

            List<Course_Info> combinedCourses = Stream.concat(coursesByPrefix.stream(), courseByNumber.stream())
                    .distinct()
                    .collect(Collectors.toList());
            if (combinedCourses.isEmpty()) {
                throw new CourseNotFoundException("No Course were found matching your input");
            }
            return combinedCourses;
        } catch (CourseNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new CourseServiceException("An unexpected error occurred while retrieving course information", e);
        }


    }

}
