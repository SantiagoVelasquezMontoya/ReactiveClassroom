package com.co.ias.Classroom.domain.gateway;

import com.co.ias.Classroom.domain.model.course.Course;

public interface CourseRepository {


    public String saveCourse(Course course);
}
