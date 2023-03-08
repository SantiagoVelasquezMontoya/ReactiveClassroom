package com.co.ias.Classroom.infrastructure.adapters.jpa.course;

import com.co.ias.Classroom.domain.gateway.CourseRepository;
import com.co.ias.Classroom.domain.model.course.Course;
import com.co.ias.Classroom.infrastructure.adapters.jpa.course.entity.dbo.CourseDBO;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class CourseRepositoryAdapter implements CourseRepository {

    private ICourseRepositoryAdapter courseRepository;

    public CourseRepositoryAdapter(ICourseRepositoryAdapter courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public String saveCourse(Course course) {
        Mono<CourseDBO> courseMono = Mono.just(new CourseDBO(course));
         Mono<CourseDBO> mycourse = courseMono.flatMap(courseRepository::save);
        return "Course Saved";
    }
}
