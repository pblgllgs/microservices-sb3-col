package com.pblgllgs.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_course_id")
    @SequenceGenerator(
            name = "sequence_course_id",
            sequenceName = "sequence_course_id",
            allocationSize = 1
    )
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "teacher")
    private String teacher;
}
