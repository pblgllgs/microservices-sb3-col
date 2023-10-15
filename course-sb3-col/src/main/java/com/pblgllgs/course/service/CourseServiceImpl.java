package com.pblgllgs.course.service;

import com.pblgllgs.course.client.StudentClient;
import com.pblgllgs.course.entity.Course;
import com.pblgllgs.course.entity.dto.StudentDto;
import com.pblgllgs.course.http.response.StudentByCourseResponse;
import com.pblgllgs.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("NOT_FOUND"));
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentsByCourseId(Long courseId) {
        List<StudentDto> studentDtoList = studentClient.findAllStudentsByCourseId(courseId);
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("NOT_FOUND"));
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDtoList(studentDtoList)
                .build();
    }
}
