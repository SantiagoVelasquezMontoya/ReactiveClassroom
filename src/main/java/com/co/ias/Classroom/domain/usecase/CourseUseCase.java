package com.co.ias.Classroom.domain.usecase;

import com.co.ias.Classroom.domain.gateway.CourseRepository;

public class CourseUseCase {

    private CourseRepository courseRepository;

    public CourseUseCase(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
