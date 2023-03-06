package com.co.ias.Classroom.domain.model.student;

public class Student {
    private final StudentId id;
    private final StudentName name;
    private final StudentEmail email;

    public Student(StudentId id, StudentName name, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public StudentId getId() {
        return id;
    }

    public StudentName getName() {
        return name;
    }

    public StudentEmail getEmail() {
        return email;
    }
}
