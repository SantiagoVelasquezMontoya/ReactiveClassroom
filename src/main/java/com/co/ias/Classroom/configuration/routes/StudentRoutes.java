package com.co.ias.Classroom.configuration.routes;

import com.co.ias.Classroom.infrastructure.entrypoint.StudentHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class StudentRoutes {
    @Value("{PATH_BASE}")
    private String PATH_BASE;

    @Bean
    public RouterFunction<ServerResponse> studentEndpoints(StudentHandler handler){
        return route()
                .POST("/student", accept(MediaType.TEXT_EVENT_STREAM), handler::saveStudent)
                .build();
    }
}
