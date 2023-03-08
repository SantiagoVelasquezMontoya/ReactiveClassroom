package com.co.ias.Classroom.domain.model.course.dto;

import com.co.ias.Classroom.domain.model.course.Course;
import com.co.ias.Classroom.domain.model.course.CourseId;
import com.co.ias.Classroom.domain.model.course.CourseName;
import com.co.ias.Classroom.domain.model.student.Student;
import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;
import com.co.ias.Classroom.infrastructure.adapters.jpa.course.entity.dbo.CourseDBO;

import java.util.List;
import java.util.stream.Collectors;

public class CourseDTO {
    private Integer id;
    private String name;
    private List<StudentDTO> studentList;

    public CourseDTO(Integer id, String name, List<StudentDTO> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }

    public CourseDTO(CourseDBO course) {
        this.id = course.getId();
        this.name = course.getName();
        this.studentList = course.getStudentList().stream().map(StudentDTO::new).collect(Collectors.toList());
    }

    public CourseDTO(Course course){
        this.id = course.getId().getValue();
        this.name = course.getName().getValue();
        this.studentList = course.getStudentList().stream().map(StudentDTO::new).collect(Collectors.toList());
    }

    public static Course toCourse(CourseDTO course){
        return new Course(
                new CourseId(course.getId()),
                new CourseName(course.getName()),
                course.getStudentList().stream().map(StudentDTO::toStudent).collect(Collectors.toList())
        );
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDTO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDTO> studentList) {
        this.studentList = studentList;
    }
}
