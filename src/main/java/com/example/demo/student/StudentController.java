package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

// Controller know as the API layer
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // Autowired acts likes a dependency injection for the field above into the constructor below, but...
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //...
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
