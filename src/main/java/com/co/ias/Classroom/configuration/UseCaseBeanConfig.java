package com.co.ias.Classroom.configuration;

import com.co.ias.Classroom.domain.gateway.CourseRepository;
import com.co.ias.Classroom.domain.gateway.StudentRepository;
import com.co.ias.Classroom.domain.usecase.CourseUseCase;
import com.co.ias.Classroom.domain.usecase.StudentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
