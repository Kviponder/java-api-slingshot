package com.campusedu.devexercise.repository;

import com.campusedu.devexercise.model.Course_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CourseInfoRepository extends JpaRepository<Course_Info, Integer> {

    // Find courses by course code prefix
    List<Course_Info> findByCourseCodePrefix(String courseCodePrefix) throws Exception;

    // Find courses by course code number
    List<Course_Info> findByCourseCodeNumber(String courseCodeNumber) throws Exception;

    // Find courses by course code prefix and/or number
    List<Course_Info> findByCourseCodePrefixAndCourseCodeNumber(String courseCodePrefix, String courseCodeNumber);

    // Find all courses
    List<Course_Info> findAll();

}
