package com.co.ias.Classroom.infrastructure.adapters.jpa.student;

import com.co.ias.Classroom.infrastructure.adapters.jpa.student.entity.dbo.StudentDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IStudentRepositoryAdapter extends ReactiveCrudRepository<StudentDBO, Integer> {
}
