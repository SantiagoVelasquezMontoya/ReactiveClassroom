package com.co.ias.Classroom.domain.model.course.dto;

import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;

import java.util.List;

public class CourseDTO {
    private Integer id;
    private String name;
    private List<StudentDTO> studentList;

    public CourseDTO(Integer id, String name, List<StudentDTO> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
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
