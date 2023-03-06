package com.co.ias.Classroom.infrastructure.adapters.jpa;

import com.co.ias.Classroom.domain.gateway.StudentRepository;
import com.co.ias.Classroom.domain.model.student.Student;
import com.co.ias.Classroom.domain.model.student.StudentEmail;
import com.co.ias.Classroom.domain.model.student.StudentId;
import com.co.ias.Classroom.domain.model.student.StudentName;
import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;
import com.co.ias.Classroom.infrastructure.adapters.jpa.entity.dbo.StudentDBO;
import org.springframework.stereotype.Repository;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;


@Repository
public class StudentRepositoryAdapter implements StudentRepository {

    public final IStudentRepositoryAdapter studentRepositoryAdapter;

    public StudentRepositoryAdapter(IStudentRepositoryAdapter studentRepositoryAdapter) {
        this.studentRepositoryAdapter = studentRepositoryAdapter;
    }

    @Override
    public Student saveStudent(Student student) {
        Mono<StudentDBO> myStudent = Mono.just(new StudentDBO(student));
        Mono<StudentDBO> received =  myStudent.flatMap(studentRepositoryAdapter::save);
        StudentDBO testDBO = new StudentDBO();
        received.subscribe(v -> {
            System.out.println(v);
            testDBO.setId(v.getId());
            testDBO.setName(v.getName());
            testDBO.setEmail(v.getEmail());
        });
        return StudentDBO.toStudent(testDBO);
    }
}
