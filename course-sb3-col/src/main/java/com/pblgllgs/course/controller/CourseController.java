package com.pblgllgs.course.controller;

import com.pblgllgs.course.entity.Course;
import com.pblgllgs.course.http.response.StudentByCourseResponse;
import com.pblgllgs.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> findAllCourses() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.save(course), HttpStatus.CREATED);
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<Course> findCourseById(@PathVariable("courseId") Long courseId) {
        return new ResponseEntity<>(courseService.findById(courseId), HttpStatus.OK);
    }

    @GetMapping("/search-by-course-id/{courseId}")
    public ResponseEntity<StudentByCourseResponse> findStudentsByCourseId(@PathVariable("courseId") Long courseId) {
        return new ResponseEntity<>(courseService.findStudentsByCourseId(courseId), HttpStatus.OK);
    }
}
