package com.pblgllgs.student.service;

import com.pblgllgs.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    Student save(Student student);
    List<Student> findAllByCourseId(Long courseId);
}
