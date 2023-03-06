package com.co.ias.Classroom.domain.model.student.dto;

import com.co.ias.Classroom.domain.model.student.Student;
import com.co.ias.Classroom.domain.model.student.StudentEmail;
import com.co.ias.Classroom.domain.model.student.StudentId;
import com.co.ias.Classroom.domain.model.student.StudentName;
import com.co.ias.Classroom.infrastructure.adapters.jpa.entity.dbo.StudentDBO;

public class StudentDTO {
    private Integer id;
    private String name;
    private String email;

    public StudentDTO(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public StudentDTO(StudentDBO student){
        this.id = student.getId();
        this.name = student.getName();
        this.email = student.getEmail();
    }
    public StudentDTO(Student student){
        this.id = student.getId().getValue();
        this.name = student.getName().getValue();
        this.email = student.getEmail().getValue();
    }
    public static Student toStudent(StudentDTO student){
        return new Student(
                new StudentId(student.getId()),
                new StudentName(student.getName()),
                new StudentEmail(student.getEmail())
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
