package com.co.ias.Classroom.infrastructure.adapters.jpa.student;

import com.co.ias.Classroom.domain.gateway.StudentRepository;
import com.co.ias.Classroom.domain.model.student.Student;
import com.co.ias.Classroom.infrastructure.adapters.jpa.student.entity.dbo.StudentDBO;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public class StudentRepositoryAdapter implements StudentRepository {

    public final IStudentRepositoryAdapter studentRepositoryAdapter;

    public StudentRepositoryAdapter(IStudentRepositoryAdapter studentRepositoryAdapter) {
        this.studentRepositoryAdapter = studentRepositoryAdapter;
    }

    @Override
    public Mono<Student> saveStudent(Student student) {
        Mono<StudentDBO> myStudent = Mono.just(new StudentDBO(student));
        Mono<StudentDBO> received =  myStudent.flatMap(studentRepositoryAdapter::save);
        return received.map(StudentDBO::toStudent);
    }
}
