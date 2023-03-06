package com.co.ias.Classroom.domain.gateway;

import com.co.ias.Classroom.domain.model.student.Student;
import reactor.core.publisher.Mono;

public interface StudentRepository {


    public Student saveStudent(Student student);

}
