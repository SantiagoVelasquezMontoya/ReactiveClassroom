package com.co.ias.Classroom.infrastructure.adapters.jpa.course;

import com.co.ias.Classroom.infrastructure.adapters.jpa.course.entity.dbo.CourseDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICourseRepositoryAdapter extends ReactiveCrudRepository<CourseDBO, Integer> {
}
