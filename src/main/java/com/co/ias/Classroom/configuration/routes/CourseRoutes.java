package com.co.ias.Classroom.configuration.routes;

import com.co.ias.Classroom.domain.model.course.Course;
import com.co.ias.Classroom.infrastructure.entrypoint.CourseHandler;
import com.co.ias.Classroom.infrastructure.entrypoint.StudentHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CourseRoutes {

    @Bean
    public RouterFunction<ServerResponse> courseEndpoints(CourseHandler handler){
        return route()
                .POST("/course", accept(MediaType.APPLICATION_JSON), handler::saveCourse)
                .build();
    }
}
