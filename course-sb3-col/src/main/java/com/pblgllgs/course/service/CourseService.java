package com.pblgllgs.course.service;

import com.pblgllgs.course.entity.Course;
import com.pblgllgs.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    Course findById(Long id);

    Course save(Course course);

    StudentByCourseResponse findStudentsByCourseId(Long courseId);
}
