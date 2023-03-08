package com.co.ias.Classroom.domain.usecase;

import com.co.ias.Classroom.domain.gateway.StudentRepository;
import com.co.ias.Classroom.domain.model.student.Student;
import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;
import reactor.core.publisher.Mono;

public class StudentUseCase {

    private StudentRepository studentRepository;

    public StudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Mono<StudentDTO> saveStudent(StudentDTO student){
        return studentRepository.saveStudent(StudentDTO.toStudent(student)).map(StudentDTO::new);
    }
}
