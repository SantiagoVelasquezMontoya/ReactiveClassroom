package com.co.ias.Classroom.infrastructure.adapters.jpa.course.entity.dbo;

import com.co.ias.Classroom.infrastructure.adapters.jpa.entity.dbo.StudentDBO;
import org.springframework.data.annotation.Id;

import java.util.List;

public class CourseDBO {

    @Id
    private Integer id;
    private String  name;
    private List<StudentDBO> studentList;

    public CourseDBO(Integer id, String name, List<StudentDBO> studentList) {
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

    public List<StudentDBO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDBO> studentList) {
        this.studentList = studentList;
    }
}
