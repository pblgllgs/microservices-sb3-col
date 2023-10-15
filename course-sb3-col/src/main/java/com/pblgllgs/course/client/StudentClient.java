package com.pblgllgs.course.client;

import com.pblgllgs.course.entity.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student", url = "http://localhost:8080/api/v1/students")
public interface StudentClient {

    @GetMapping("/search-by-course-id/{courseId}")
    List<StudentDto> findAllStudentsByCourseId(@PathVariable("courseId") long courseId);
}
