package com.co.ias.Classroom.configuration;

import com.co.ias.Classroom.domain.gateway.CourseRepository;
import com.co.ias.Classroom.domain.gateway.StudentRepository;
import com.co.ias.Classroom.domain.usecase.CourseUseCase;
import com.co.ias.Classroom.domain.usecase.StudentUseCase;
import com.co.ias.Classroom.infrastructure.adapters.jpa.IStudentRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
public class UseCaseBeanConfig {


    @Bean
    public StudentUseCase studentUseCase(StudentRepository studentRepository){
        return new StudentUseCase(studentRepository);
    }

    @Bean
    public CourseUseCase courseUseCase(CourseRepository courseRepository){
        return new CourseUseCase(courseRepository);
    }
}
