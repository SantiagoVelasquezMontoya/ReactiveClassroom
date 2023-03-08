package com.co.ias.Classroom.domain.usecase;

import com.co.ias.Classroom.domain.gateway.CourseRepository;
import com.co.ias.Classroom.domain.model.course.dto.CourseDTO;

public class CourseUseCase {

    private CourseRepository courseRepository;

    public CourseUseCase(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public String saveCourse(CourseDTO course){
        return courseRepository.saveCourse(CourseDTO.toCourse(course));
    }
}
