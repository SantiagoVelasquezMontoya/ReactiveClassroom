package com.co.ias.Classroom.infrastructure.entrypoint;


import com.co.ias.Classroom.domain.model.course.dto.CourseDTO;
import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;
import com.co.ias.Classroom.domain.usecase.CourseUseCase;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CourseHandler {

    private CourseUseCase courseUseCase;

    public CourseHandler(CourseUseCase courseUseCase) {
        this.courseUseCase = courseUseCase;
    }

    public Mono<ServerResponse> saveCourse(ServerRequest request){
        return  request
                .bodyToMono(CourseDTO.class)
                .flatMap(value -> ServerResponse.ok().bodyValue(courseUseCase.saveCourse(value)));
    }
}
