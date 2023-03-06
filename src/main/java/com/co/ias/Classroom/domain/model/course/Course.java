package com.co.ias.Classroom.domain.model.course;

import com.co.ias.Classroom.domain.model.student.Student;

import java.util.List;

public class Course {
    private final CourseId id;
    private final CourseName name;
    private final List<Student> studentList;
    public Course(CourseId id, CourseName name, List<Student> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }
    public CourseId getId() {
        return id;
    }
    public CourseName getName() {
        return name;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
}
