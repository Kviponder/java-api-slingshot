package com.campusedu.devexercise.repository;

import com.campusedu.devexercise.model.Course_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CourseInfoRepository extends JpaRepository<Course_Info, Integer> {
    List<Course_Info> findByCourseCodePrefix(String courseCodePrefix) throws Exception;

    List<Course_Info> findByCourseCodeNumber(String courseCodeNumber) throws Exception;

    List<Course_Info> findAll();

}
