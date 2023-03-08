package com.co.ias.Classroom.domain.gateway;

import com.co.ias.Classroom.domain.model.student.Student;
import reactor.core.publisher.Mono;

public interface StudentRepository {


    public Mono<Student> saveStudent(Student student);

}
