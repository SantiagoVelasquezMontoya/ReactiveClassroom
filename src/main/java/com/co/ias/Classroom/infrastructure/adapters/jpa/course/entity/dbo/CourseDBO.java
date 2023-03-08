package com.co.ias.Classroom.infrastructure.adapters.jpa.course.entity.dbo;

import com.co.ias.Classroom.domain.model.course.Course;
import com.co.ias.Classroom.domain.model.course.CourseId;
import com.co.ias.Classroom.domain.model.course.CourseName;
import com.co.ias.Classroom.domain.model.course.dto.CourseDTO;
import com.co.ias.Classroom.infrastructure.adapters.jpa.student.entity.dbo.StudentDBO;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.stream.Collectors;





@Table(name = "course")
public class CourseDBO {

    @Id
    private Integer id;
    private String  name;
    private List<StudentDBO> studentList;

    public CourseDBO(Integer id, String name, List<StudentDBO> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }
    public CourseDBO(CourseDTO course) {
        this.id = course.getId();
        this.name = course.getName();
        this.studentList = course.getStudentList().stream().map(StudentDBO::new).collect(Collectors.toList());
    }

    public CourseDBO(Course course){
        this.id = course.getId().getValue();
        this.name = course.getName().getValue();
        this.studentList = course.getStudentList().stream().map(StudentDBO::new).collect(Collectors.toList());
    }

    public static Course toCourse(CourseDBO course){
        return new Course(
                new CourseId(course.getId()),
                new CourseName(course.getName()),
                course.getStudentList().stream().map(StudentDBO::toStudent).collect(Collectors.toList())
        );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDBO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDBO> studentList) {
        this.studentList = studentList;
    }
}
