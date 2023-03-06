package com.co.ias.Classroom.domain.usecase;

import com.co.ias.Classroom.domain.gateway.StudentRepository;
import com.co.ias.Classroom.domain.model.student.Student;
import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;
import com.co.ias.Classroom.infrastructure.adapters.jpa.IStudentRepositoryAdapter;

public class StudentUseCase {

    private StudentRepository studentRepository;

    public StudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO saveStudent(StudentDTO student){
        StudentDTO saved = new StudentDTO(studentRepository.saveStudent(StudentDTO.toStudent(student)));
        return saved;
    }
}
