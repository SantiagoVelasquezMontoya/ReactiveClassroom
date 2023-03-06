package com.co.ias.Classroom.infrastructure.adapters.jpa;

import com.co.ias.Classroom.infrastructure.adapters.jpa.entity.dbo.StudentDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

public interface IStudentRepositoryAdapter extends ReactiveCrudRepository<StudentDBO, Integer> {
}
