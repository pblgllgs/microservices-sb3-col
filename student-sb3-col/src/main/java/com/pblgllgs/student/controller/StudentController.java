package com.pblgllgs.student.controller;

import com.pblgllgs.student.entity.Student;
import com.pblgllgs.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search-by-course-id/{courseId}")
    public ResponseEntity<List<Student>> findAllStudentsByCourseId(@PathVariable("courseId") long courseId) {
        return new ResponseEntity<>(studentService.findAllByCourseId(courseId), HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> findStudentById(@PathVariable("studentId") long studentId) {
        return new ResponseEntity<>(studentService.findById(studentId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.save(student),HttpStatus.CREATED);
    }
}
