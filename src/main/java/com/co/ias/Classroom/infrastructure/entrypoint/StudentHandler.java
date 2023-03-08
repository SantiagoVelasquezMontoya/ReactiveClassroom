package com.co.ias.Classroom.infrastructure.entrypoint;

import com.co.ias.Classroom.domain.model.student.dto.StudentDTO;
import com.co.ias.Classroom.domain.usecase.StudentUseCase;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class StudentHandler {

    private StudentUseCase studentUseCase;
    public StudentHandler(StudentUseCase studentUseCase) {
        this.studentUseCase = studentUseCase;
    }

    public Mono<ServerResponse> saveStudent(ServerRequest request){
        return  request
                .bodyToMono(StudentDTO.class)
                .flatMap(value -> ServerResponse.ok().body(studentUseCase.saveStudent(value), StudentDTO.class));
    }
}
